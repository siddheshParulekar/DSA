package org.example.takeUforward.array;

import java.util.HashMap;

public class MAjorityEleements {

    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int max = nums[0];
        int count = 0;

        for (int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for (Integer i : map.keySet()){
            count = Math.max(count,map.get(i));
            if (count == map.get(i))
                max = i;
        }
        return max;
    }
}
