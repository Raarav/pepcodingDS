import java.util.*;

public class mazePath2Direc
{
    public static int traverse(int cr,int cc,int er,int ec,String path)
    {   if(cc==ec&&cr==er)
        {
            System.out.println(path);
            return 1;
        }
        int ans=0;     
        if(cc+1<=ec){
            //horizontal
            ans += traverse(cr,cc+1,er,ec,path+"h");
        }
        if(cr+1<=er)
        {
            //vertical
            ans += traverse(cr+1,cc,er,ec,path+"v");
        }
        return ans;
    }                           
    public static void main(String[] args)
    {
        System.out.print(traverse(0,0,2,2,""));
    }
}