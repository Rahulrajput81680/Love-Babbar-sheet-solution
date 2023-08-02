public class max_of_array{
    public static int  max(int arr[]){
        int largest=Integer.MAX_VALUE;
        int smallest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(smallest<arr[i]){
                smallest=arr[i];
            }
            if(largest>arr[i]){
                largest=arr[i];
        }
    }
        System.out.println("smallests number is:"+largest);
        return smallest;
    }
    public static void main(String[] args) {
        int arr[]={5,4,8,9,12,15};
        System.out.println("largest number is:"+max(arr));
       
    }
}