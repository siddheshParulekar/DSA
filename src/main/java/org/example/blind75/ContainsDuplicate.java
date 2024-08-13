package org.example.blind75;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        return nums.length != set.size();



    }

    public static void main(String[] args) {

    }
}
