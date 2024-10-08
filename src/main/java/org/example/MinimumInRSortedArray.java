package org.example;

public class MinimumInRSortedArray {



    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while(start<end){
            int mid= start + (end - start)/2;

            if(mid>0 && nums[mid]<nums[mid-1])
                return nums[mid];
            else if(nums[start]<=nums[mid] && nums[mid] >nums[end])
                start = mid+1;
            else
                end = mid -1;
        }

        return nums[start];
    }

    public static void main(String[] args) {

        MinimumInRSortedArray minimumInRSortedArray = new MinimumInRSortedArray();
     int[] nums = {3,3,1,3};
//        int[] nums = {1,3,3};

        System.out.println(minimumInRSortedArray.findMin(nums));
    }
}
