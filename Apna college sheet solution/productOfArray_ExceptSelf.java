public class productOfArray_ExceptSelf{

    public static int[] product(int[] nums){
        int n=nums.length;
        int result[] = new int[n];
        int productOfAllBeforeCurrent=1;
        int productOfAllAfterCurrent=1;

        //calculates product of all before current
        for(int i=0;i<n;i++){
            result[i]=productOfAllBeforeCurrent;
            productOfAllBeforeCurrent *=nums[i];
        }
        //calculates product of all after current
        for(int i=n-1;i>=0;i--){
            result[i]=result[i]*productOfAllAfterCurrent;
            productOfAllAfterCurrent *=nums[i];
        }
       return result;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
       System.out.println(product(nums));
    }
}