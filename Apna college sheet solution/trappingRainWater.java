public class trappingRainWater{

    public static int totalWater(int height[]){
        int n=height.length;
        int leftMax[]= new int[n];
        int RightMax[] = new int[n];

        int max=0;
        int totalwater=0;

        //for lett most building
        for(int i=0;i<n;i++){
            max=Math.max(max,height[i]);
            leftMax[i]=max;
        }
        
        //for right most building
        max=0;
        for(int i=n-1;i>=0;i--){
            max=Math.max(max,height[i]);
            RightMax[i]=max;
        }

        for(int i=n-1;i>=0;i--){
            int water=Math.min(leftMax[i],RightMax[i])-height[i];
            totalwater=totalwater+water;
        }
        return totalwater;
    }
    public static void main(String[] args) {
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(totalWater(height));
    }
}