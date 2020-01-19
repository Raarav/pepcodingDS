public class memory{

    static void run(int[] crr){

        System.out.println(crr);
        crr[3]=100;
    }

    static void fun(int[] brr){
        System.out.println(brr);

        run(brr);

    }
    public static void main(String[] args)
    {
        int[] arr;
        // System.out.print(arr);
        arr=new int[5];
        System.out.println(arr);
        fun(arr);
        arr=new int[8];
        System.out.println(arr);
        for(int i :arr){
            System.out.print(i+" ");
        }

    }
}