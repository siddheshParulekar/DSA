package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //without help

    public int[] getTwoSum(int[] nums, int target) {
        int[] array = new int[2]; // Creates an array of size 5 with default values (0 for int)
        Map<Integer,Integer> resultMap = new HashMap<>();

        for (int i=0;i<nums.length;i++){
            int otherPair = target - nums[i];
            if (resultMap.containsKey(otherPair)){
                array[0]=resultMap.get(otherPair);
                array[1]=i;
            }
            resultMap.put(nums[i],i );
        }

        return array;
    }


    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int nums[] = {2,11,7,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum.getTwoSum(nums,target)));
    }
}
