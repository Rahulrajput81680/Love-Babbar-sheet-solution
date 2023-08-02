import java.util.Arrays;
  
class min_max {
    public static void main(String args[])
    {
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        int k=3;
        //int n=arr.length;
        
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
       
    }
}