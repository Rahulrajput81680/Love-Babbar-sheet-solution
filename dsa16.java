public class dsa16{


    // find duplicate in an array of N+1 Integers ........ optimized approach
    //time complexity = 0(n)
    //space timecomplexity = 0(1)

    public static int duplicate(int nums[]){
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i]);

            if(nums[index]<0){
                return index;
            }
            nums[index]=-nums[index];
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={2,4,5,1,2,7,8};
        System.out.println(duplicate(nums));

    }
}