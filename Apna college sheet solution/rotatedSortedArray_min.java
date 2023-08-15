public class rotatedSortedArray_min{

    //minimum in rotated sorted array using binary search

    public static int sortedElement(int arr[],int n){
       int min=Integer.MAX_VALUE;

       for(int i=0;i<n;i++){
            if(arr[i]<min){
            min=arr[i];
            }
       }
       return min;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        int n=arr.length;
        System.out.println(sortedElement(arr, n));
    }
}