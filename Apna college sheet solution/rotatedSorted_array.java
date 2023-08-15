public class rotatedSorted_array{

    //roated sorted array using binary search

    public static int sortedArray(int arr[],int target,int n){
        int low=0,high=n-1;
        

        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(arr[low]<arr[mid]){
                if(target>=arr[low] && target<arr[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(target<=arr[high] && target>arr[mid]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        } 
        return -1;  
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=3;
        int n=arr.length;
        System.out.println(sortedArray(arr, target, n));
    }
}