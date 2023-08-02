public class dsa13{


    // it's time complexity is 0(n^2);
    
    public static void main(String[] args) {
        int arr[]={5,4,-1,7,8};
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int current_sum=0;
            for(int j=i;j<arr.length;j++){
                current_sum+=arr[j];
                maxSum=Math.max(maxSum, current_sum);
            }
        }
        System.out.println(maxSum);
        
    }
}