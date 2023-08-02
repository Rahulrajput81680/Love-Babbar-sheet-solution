public class find_duplicate{
    public static int duplicate(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return arr[j];
                } 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,3,8,5,9,6,6};
        System.out.println(duplicate(arr));
    }
}