package org.example;

import java.util.HashMap;
import java.util.Map;

public class ValidPalaindrome {

    public boolean isPalindrome(String s) {
        String result = s.trim().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(result);
        StringBuilder reversed = new StringBuilder(result).reverse();

        return  result.contentEquals(reversed);

    }

    public void revserseString(String s){

        StringBuilder stringBuilder = new StringBuilder();
        int i=s.length()-1;
        while (i>=0){
            stringBuilder.append(s.charAt(i));
            i--;
        }

        System.out.println("Befor   " + s);
        System.out.println("After  " + stringBuilder);
    }

    public int maxProfit(int[] prices) {
        int diffrence = 0;
        for (int i=0;i<prices.length;i++){
            int j = prices.length-1;
            while (j>i){
                if (prices[j] > prices[i] && prices[j] - prices[i] > diffrence)
                    diffrence = prices[j] - prices[i];
                j--;
            }
        }
        return diffrence;
    }

    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> countMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!countMap.containsKey(nums[i]))
                countMap.put(nums[i], 1);
            else {
                countMap.put(nums[i], countMap.get(nums[i])+1);
            }
        }

        System.out.println(countMap);

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value == 1) {
                return (key);
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        ValidPalaindrome validPalaindrome = new ValidPalaindrome();
//        validPalaindrome.isPalindrome("AAJ@ll!");
//        validPalaindrome.revserseString("race car");
        int[] nums = {4,1,2,1,2};
         validPalaindrome.singleNumber(nums);
    }
}
