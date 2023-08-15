import java.util.Arrays;

public class chocolateDistribute{

    //chocolate distribution problem
    //output=2
    //chocolate is distributed among all childrens only once
    // and we have to find min value among all childrens

    public static int chocolate(int arr[],int m,int n){
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++){
            int difference=arr[i+m-1]-arr[i];
            min=Math.min(difference,min);
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[]={3, 4, 1, 9, 56, 7, 9, 12};
        int m=5;
        int n=arr.length;
        System.out.println(chocolate(arr, m, n));
    }
}