import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class findkthLargest{
    //step1 using sorting algorithm

    public static int largest(int nums[],int k){
    //     Arrays.sort(nums);
    //     return nums[nums.length-k];
    // }

    // step2 using max-heap

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums){
            pq.add(i);
        }
        for(int i=1;i<k;i++){
            pq.poll();      
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        //kth largest mean if k=2 then find 2nd smallest or largest element in an array
        int nums[]={7,2,3,8,1,9,10};
        int k=3;
        System.out.println(largest(nums,k));
    }
}