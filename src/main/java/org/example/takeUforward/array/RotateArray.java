package org.example.takeUforward.array;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5},2);
    }

    public static  void rotate(int[] nums, int k) {
        int j=0;
        while(j<k){
            int temp = nums[nums.length-1];

            for (int i = nums.length-1;i>0;i--){
                nums[i] = nums[i-1];
            }
            nums[0] = temp;
            j++;
        }



        System.out.println(Arrays.toString(nums));
    }
}
