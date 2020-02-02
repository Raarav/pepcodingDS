import java.util.ArrayList;
import java.util.*;

public class arrayList
{
    public static void main(String[] args)
    {
        Scanner scn  = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();

        int count = scn.nextInt();
        for(int i=0; i<count; i++) {
            arr.add(scn.nextLine());
        }
        System.out.print(arr);
    }
}