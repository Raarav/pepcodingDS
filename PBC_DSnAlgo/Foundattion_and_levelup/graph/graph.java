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
    
    public static void main(String[] arg) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int vtx = Integer.parseInt(br.readLine());
        ArrayList<Egde>[] graph = new ArrayList[vtx];

        for(int i=0;i<vtx;i++){
            graph[i] = new ArrayList<>();
        }

        int egde = Integer.parseInt(br.readLine());

        for(int i=0;i<egde;i++){
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Egde(v1,v2,wt));
            graph[v2].add(new Egde(v2,v1,wt));
        }

        int src = Integer.parseInt(br.readLine());
        int dest = Integer.parseInt(br.readLine());

        int crtitia = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        boolean[] visited = new boolean[vtx];

        //? has Path
        // System.out.println(hasPath(graph,src,dest,visited));

        //? print all Path
        // print_allPath(   graph,src,dest,visited,src + "");

        //? Multisolver - Smallest, Longest, Ceil, Floor, Kthlargest Path        
        mutlisolver_graph(graph,src,dest,visited,src + "",src,crtitia,k);
        System.out.println("Smallest Path = " + spath + "@" + spathwt);
        System.out.println("Largest Path = " + lpath + "@" + lpathwt);
        System.out.println("Just Larger Path than " + crtitia + " = " + cpath + "@" + cpathwt);
        System.out.println("Just Smaller Path than " + crtitia + " = " + fpath + "@" + fpathwt);
        System.out.println(k+"th largest path = " + pq.peek().psf + "@" + pq.peek().wsf);
    }
}