package Array;

import java.util.Arrays;

public class KthlargestWithoutSorting {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k=4;
        System.out.println(findKthLargest(arr,arr.length));
    }
    public static int findKthLargest(int[] nums, int k) {
        int max, maxIndex;
        for (int i = 0; i < k; i++) {
            max=nums[i];
            maxIndex=i;
            for (int j = i; j < nums.length; j++) {
                if(nums[j]>=max){
                    max=nums[j];
                    maxIndex=j;
                }
            }
            if (maxIndex!=i){
                nums[maxIndex]=nums[i];
                nums[i]=max;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums[k-1];
    }
}
