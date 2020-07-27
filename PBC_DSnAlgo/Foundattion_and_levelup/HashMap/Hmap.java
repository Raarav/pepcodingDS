import java.util.HashMap;
import java.util.Map;

// count no. of frequency of array element

class Hmap{
    public static void printFreq(int[] arr){
        
        HashMap<Integer, Integer> hmp = new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            Integer c = hmp.get(arr[i]);
            if(hmp.get(arr[i])==null){
                hmp.put(arr[i],1);                
            }
            else{
                hmp.put(arr[i],++c);
            }
        }
        for(Map.Entry<Integer, Integer> e : hmp.entrySet()){
            System.out.println(e.getKey() + "->" + e.getValue());
        }
    }

    public static void main(String[] args){
        int arr[] = {34, 10, 15, 20, 10, 34, 64, 34};
        printFreq(arr);
    }
}