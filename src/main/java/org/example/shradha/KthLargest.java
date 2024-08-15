package org.example.shradha;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargest {

    public static void main(String[] args) {

        System.out.println( findKthLargest(new int[]{3,2,1,5,6,4},2));

    }
//[3,2,1,5,6,4]
    public static int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);
        return nums[nums.length-k];

    }

    public static int kthLargest(int[] nums,int k){
        PriorityQueue<Integer> integers = new PriorityQueue<>();

        for (int i : nums){
            integers.add(i);
            if (integers.size()>k){
                integers.poll();
            }
        }

        return integers.peek();
    }
}
