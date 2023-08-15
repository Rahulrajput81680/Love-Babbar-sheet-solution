public class maximumProduct_subarray{

    public static int product(int nums[]){
        int ans=nums[0];
        int max=1;
        int min=1;
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]<0){
                int temp=max;
                max=min;
                min=temp;
            }

            max=Math.max(nums[i], max*nums[i]);
            min=Math.min(nums[i],min*nums[i]);

            ans=Math.max(ans,max);
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={2,3,-2,4};
        System.out.println(product(nums));

    }
}