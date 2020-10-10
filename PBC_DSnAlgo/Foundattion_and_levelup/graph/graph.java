import java.util.*;
import java.io.*;


class graph{
    static class Egde{
        int sr;
        int nbr;
        int wt;
        Egde(int sr,int nbr,int wt){
            this.sr = sr;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    static class Pair implements Comparable<Pair> {
        int wsf;
        String psf;
        
        Pair(int wsf,String psf){
            this.wsf = wsf;
            this.psf = psf;
        }

        public int compareTo(Pair o){
            return this.wsf - o.wsf;
        }
    }

    static class PfEdge{
        int v;
        int n;
        PfEdge(int v,int n){
            this.v=v;
            this.n=n;
        }
    }

    public static boolean hasPath(ArrayList<Egde>[] graph,int src,int dest,boolean[] visited) {
        if(src == dest) {
            return true;
        } 
        
        visited[src] = true;

        for(Egde egde: graph[src]){            
            if(visited[egde.nbr] == false){
                boolean hasNbrPath = hasPath(graph,egde.nbr,dest,visited);
                if(hasNbrPath == true){
                    return true;
                }
            }    
        }

        return false;
    }

    //print all path
    public static void print_allPath(ArrayList<Egde>[] graph,int src,int dest, boolean[] visited, String path){
        
        if(src == dest){
            System.out.println(path);
            return;
        }

        visited[src] = true;
        for(Egde egde: graph[src]){
            if(visited[egde.nbr]==false){
                print_allPath(graph,egde.nbr,dest,visited,path+egde.nbr);    
            }
        } 
        visited[src] = false;
    }

    // Multisolver - Smallest, Longest, Ceil, Floor, Kthlargest Path
    static String spath;
    static Integer spathwt = Integer.MAX_VALUE;
    static String lpath;
    static Integer lpathwt = Integer.MIN_VALUE;
    static String cpath;
    static Integer cpathwt = Integer.MAX_VALUE;
    static String fpath;
    static Integer fpathwt = Integer.MIN_VALUE;
    static PriorityQueue<Pair> pq = new PriorityQueue<>();
    public static void mutlisolver_graph(ArrayList<Egde>[] graph,int src,int dest,boolean[] visited,String path,int sum,int crtitia,int k){
        
        if(src == dest){
            if(sum < spathwt){
                spathwt = sum;
                spath = path;
            } 
            
            if(sum > lpathwt){
                lpathwt = sum;
                lpath = path;
            }            

            if(sum > crtitia && sum < cpathwt){
                cpathwt = sum;
                cpath = path;
            }

            if(sum < crtitia && sum > fpathwt){
                fpathwt = sum;
                fpath = path;
            }

            if(pq.size() < k){
                pq.add(new Pair(sum,path));
            } else if(sum > pq.peek().wsf){
                pq.remove();
                pq.add(new Pair(sum,path));
            }

            return;
        }

        visited[src] = true;

        for(Egde egde: graph[src]){
            if(visited[egde.nbr]==false){
                mutlisolver_graph(graph,egde.nbr,dest,visited,path+egde.nbr,sum+egde.wt,crtitia,k);
            }
        }
        visited[src] = false;
    }

    // Get Connected Components Of A Graph
    public static void drawPathAndComp(ArrayList<Egde>[] graph,ArrayList<Integer> comp,boolean[] visited,int src){
        visited[src] = true;
        comp.add(src);
        for(Egde e: graph[src]){
            if(visited[e.nbr]==false){
                drawPathAndComp(graph,comp,visited,e.nbr);
            }
        }
    }

    // is_graph_connected
    public static boolean is_graph_connected(ArrayList<Egde>[] graph,boolean[] visited,int src,int dest){
        if(src == dest){
            return true;
        }
        visited[src] = true;
        boolean ans = false;
        for(Egde e: graph[src]){
            if(visited[e.nbr]==false){
                ans = is_graph_connected(graph,visited,e.nbr,dest);                
            }
        }
        return ans;
    }
    
    // numberOf_islands
    public static int numberOf_islands(int[][] graph,int row,int col){
        boolean[][] visited = new boolean[row][col];   
        int count = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(graph[i][j]==0 && visited[i][j]==false){
                    numOfIsaland(graph,visited,i,j);
                    count++;                    
                }
            }
        } 
        return count;
    }

    public static void numOfIsaland(int[][] graph,boolean[][] visited,int i,int j){
        if(i<0||j<0||i>=graph.length||j>=graph[0].length||graph[i][j]==1||visited[i][j]==true) {
            return;
        }

        visited[i][j] = true;
        numOfIsaland(graph,visited,i-1,j);
        numOfIsaland(graph,visited,i,j-1);
        numOfIsaland(graph,visited,i+1,j);
        numOfIsaland(graph,visited,i,j+1);
    }

    //? perfect frnds
    public static void perfect_frnds(ArrayList<PfEdge>[] pfgraph,ArrayList<Integer> comp,boolean[] visited,int src){
        visited[src] = true;
        comp.add(src);
        for(PfEdge e: pfgraph[src]){
            if(visited[e.n] == false){
                perfect_frnds(pfgraph,comp,visited,e.n);
            }   
        }   
    }

    public static void main(String[] arg) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int vtx = Integer.parseInt(br.readLine());
        // ArrayList<Egde>[] graph = new ArrayList[vtx];

        // for(int i=0;i<vtx;i++){
        //     graph[i] = new ArrayList<>();
        // }

        // int egde = Integer.parseInt(br.readLine());

        // for(int i=0;i<egde;i++){
        //     String[] parts = br.readLine().split(" ");
        //     int v1 = Integer.parseInt(parts[0]);
        //     int v2 = Integer.parseInt(parts[1]);
        //     int wt = Integer.parseInt(parts[2]);
        //     graph[v1].add(new Egde(v1,v2,wt));
        //     graph[v2].add(new Egde(v2,v1,wt));
        // }

        
        //? has Path
        // int src = Integer.parseInt(br.readLine());
        // int dest = Integer.parseInt(br.readLine());
        // boolean[] visited = new boolean[vtx];
        // System.out.println(hasPath(graph,src,dest,visited));

        //? print all Path
        // int src = Integer.parseInt(br.readLine());
        // int dest = Integer.parseInt(br.readLine());
        // boolean[] visited = new boolean[vtx];
        // print_allPath(   graph,src,dest,visited,src + "");

        //? Multisolver - Smallest, Longest, Ceil, Floor, Kthlargest Path 
        // int src = Integer.parseInt(br.readLine());
        // int dest = Integer.parseInt(br.readLine());
        // int crtitia = Integer.parseInt(br.readLine());
        // int k = Integer.parseInt(br.readLine());

        // boolean[] visited = new boolean[vtx];
        
        // mutlisolver_graph(graph,src,dest,visited,src + "",src,crtitia,k);
        // System.out.println("Smallest Path = " + spath + "@" + spathwt);
        // System.out.println("Largest Path = " + lpath + "@" + lpathwt);
        // System.out.println("Just Larger Path than " + crtitia + " = " + cpath + "@" + cpathwt);
        // System.out.println("Just Smaller Path than " + crtitia + " = " + fpath + "@" + fpathwt);
        // System.out.println(k+"th largest path = " + pq.peek().psf + "@" + pq.peek().wsf);

        //? Get Connected Components Of A Graph
        // boolean[] visited = new boolean[vtx];
        // ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
        // for(int i=0;i<vtx;i++){
        //     if(visited[i]==false){
        //         ArrayList<Integer> comp = new ArrayList<>();
        //         drawPathAndComp(graph,comp,visited,i); 
        //         comps.add(comp);
        //     }
        // } 
        // System.out.print(comps);    
        
        // ? Is Graph Connected
        // boolean[] visited = new boolean[vtx];
        // System.out.print(is_graph_connected(graph,visited,0,vtx-1));

        //? Number Of Islands
        // int row = Integer.parseInt(br.readLine());
        // int col = Integer.parseInt(br.readLine());
        // int[][] graph = new int[row][col];
        // for(int i=0;i<row;i++){
        //     String parts = br.readLine();
        //     for(int j=0;j<col;j++){
        //        graph[i][j] = Integer.parseInt(parts.split(" ")[j]);
        //     }
        // }
        // System.out.print(numberOf_islands(graph,row,col));

        // //? Perfect friends
        int stu = Integer.parseInt(br.readLine());
        ArrayList<PfEdge>[] pfgraph = new ArrayList[stu];

        for(int i=0;i<stu;i++){
            pfgraph[i] = new ArrayList<>();
        }

        int clubs = Integer.parseInt(br.readLine());

        for(int i=0;i<clubs;i++){
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            pfgraph[v1].add(new PfEdge(v1,v2));
            pfgraph[v2].add(new PfEdge(v2,v1));
        }

        boolean[] visited = new boolean[stu];
        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
        for(int i=0;i<stu;i++){
            if(visited[i]==false){
                ArrayList<Integer> comp = new ArrayList<>();
                perfect_frnds(pfgraph,comp,visited,i);
                comps.add(comp);
            }
        }

        int pairs = 0;

        for(int i=0;i<comps.size();i++){
            for(int j=i+1;j<comps.size();j++){
                int count = comps.get(i).size()*comps.get(j).size();
                pairs += count;
            }
        }
        System.out.print(pairs);
    }
}