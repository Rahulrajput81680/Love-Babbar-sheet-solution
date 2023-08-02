import java.util.Arrays;

public class dsa_sheet5{

    //move all negative elements in one side

    public static void move(int arr[]){
        Arrays.sort(arr);
        
        
    }
    public static void main(String[] args) {
        int arr[]={-5,4,2,-8,-9,1,0,2,-1};
        move(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}