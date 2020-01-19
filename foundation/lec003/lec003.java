public class lec003
{
    public static void main(String[] args)
    {
        int n=5;
        pattern0(n);
        pattern1(n);
        pattern2(n);
        pascaltriangle(n);
    }
    private static int pattern0(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        return 0;
    }

    private static int pattern1(int n)
    {
        int var=1;
        for(int i=0;i<n;i++)
        {            
            for(int j=0;j<=i;j++)
            {
                System.out.print(var + " ");
                var++;
            }
            System.out.println(" ");
        }
        return 0;
    }
    private static int pattern2(int n)
    {
        int a=0,b=1,c=0;
        for(int i=0;i<n;i++)
        {            
            for(int j=0;j<=i;j++)
            {
                System.out.print(a +" ");
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println(" ");
        }
        return 0;
    }
    private static int pascaltriangle(int n)
    {
        int rC0=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                int rCn=
            }
        }
        return 0;
    }
}
