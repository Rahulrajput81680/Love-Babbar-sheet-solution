public class containerWith_mostWater{
    public static int totalWater(int height[]){
        //using brute force approach

        // int totalwater=0;
        // for(int i=0;i<height.length;i++){
        //     for(int j=i+1;j<height.length;j++){
        //         int ht=Math.min(height[i],height[j]);
        //         int width=j-i;
        //         int currWater=ht*width;
        //         totalwater=Math.max(totalwater, currWater);
        //     }
        // }
        // return totalwater;

        // using 2 pointer approach 

        int totalwater=0;
        int left=0;
        int right=height.length-1;

        while(left<right){
            int ht=Math.min(height[left],height[right]);
            int width=right-left;
            int currWater=ht*width;
            totalwater=Math.max(totalwater, currWater);

            if(height[left]<height[right]){
            left++;
            } else{
            right--;
            }

        }
        return totalwater;  
    }
    
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        System.out.println(totalWater(height));

    }
}