public class intersection_of_arrays{
    public static void intersection(int arr1[],int arr2[],int m,int n){
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                i++;
            }else if(arr2[j]<arr1[i]){
                j++;
            }else{
                System.out.print(arr2[j]+" ");
                i++;
                j++;
            }
        } 

    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7,8};
        int arr2[]={1,2,4,5,8,10,15};
        int m=arr1.length;
        int n=arr2.length;
        intersection(arr1, arr2, m, n);
    }
}