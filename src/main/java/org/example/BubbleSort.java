package org.example;

import java.util.Arrays;

public class BubbleSort {

    private void bubble(int[] nums){

        if (nums.length == 1|| nums.length == 0)
            return;

        for (int i = 0 ;i<nums.length -1;i++){
            for (int j=1;j<nums.length-i;j++){
                if (nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,1,3,5,4};
         BubbleSort bubbleSort= new BubbleSort();
        bubbleSort.bubble(nums);
        System.out.println(Arrays.toString(nums));

    }
}
