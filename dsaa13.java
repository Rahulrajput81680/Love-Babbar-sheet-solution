public class dsaa13{

    // it's time complexity is 0(n) using kadane's algorithm it is
    // best approach to find largest sum contiguous subarray

    public static int max_subarray(int arr[]){
        int currentSum=0;
        int bestSum=arr[0];

        for(int i=0;i<arr.length;i++){
           currentSum=Math.max(arr[i], currentSum+arr[i]);
           bestSum=Math.max(currentSum, bestSum);
        }
        return bestSum;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(max_subarray(arr));
        
        
    }
}