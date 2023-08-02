public class Array_Rotation12{
    public static void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

    }
    public static void reverse(int[] nums,int start,int end){
            while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
            }
        }
    public static void main(String[] args) {
       int nums[]={1,5,4,6,8,7};
       int k=3;
       int start;
       int end;
       
       System.out.println(rotate(nums, k));
    }
}