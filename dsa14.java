import java.util.Arrays;

public class dsa14{

// Minimise the maximum difference between heights [V.IMP]

    public static int heights(int arr[],int k,int n){
        if(n==1){
            return 0;
        }
        Arrays.sort();
        int diff=arr[n-1]-arr[0];
        int max,min;
        for(int i=1;i<n;i++){
            if(arr[i]-k<0){
                continue;
            }
            max=Math.max(arr[i-1]+k, arr[n-1]-k);
            min=Math.min(arr[0]+k,arr[i]-k);

            diff=Math.min(diff, max-min);
        }
        
    }
    public static void main(String[] args) {
        
        int arr[]={2,4,5,8,7,1,3};
        int n=arr.length;
        int k=2;
        System.out.println(heights(arr, k, n));

    }
}