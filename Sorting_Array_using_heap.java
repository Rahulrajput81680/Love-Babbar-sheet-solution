import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Sorting_Array_using_heap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of array elements");
        int n = sc.nextInt();
        int arr[]=new int[n];

        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i], 1);

        }
        System.out.println("sorted array is: "+map.getKey());
    }
}