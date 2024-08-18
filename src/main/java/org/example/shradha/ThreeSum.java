package org.example.shradha;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }


    public  static List<List<Integer>> threeSum(int[] nums){

        Arrays.sort(nums);
        Set<List<Integer>> uniqueset = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j< nums.length;j++){
                int k = nums.length-1;
                while (j<k){
                    if (nums[i] + nums[k] +nums[j] ==0) {
                        uniqueset.add(List.of(nums[i],nums[k],nums[j]));
                    }
                    k--;
                }
            }

        }
        return new ArrayList<>(uniqueset);
    }
}
