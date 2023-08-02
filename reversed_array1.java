import java.utill.*;
public class rversed_array1{
    public static void reverse(int arr[],int left,int right){
        

        while(left<=right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void print(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        print(arr, 8);
        reverse(arr, 0, 8);
        System.out.println("reversed array is:");
        print(arr, 9);
    }
}