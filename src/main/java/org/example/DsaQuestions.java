package org.example;

import java.math.BigDecimal;
import java.util.*;

public class DsaQuestions {

    public int removeDuplicates(int[] nums) {
       int l=1;
        for (int i =1;i<nums.length;i++){
            if (nums[i] != nums[i-1]){
                nums[l]=nums[i];
                l++;
            }
        }
        return l;
    }
    public int removeElement(int[] nums, int val) {

        int left= 0;
        for (int i = 0;i<nums.length-1;i++){
            if (nums[i] != val){
                nums[left] = nums[i];
                left++;
            }

        }
return left;
    }

    public int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);
    }

    public int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        return s1[s1.length-1].length();
    }

//    public List<Integer> sequentialDigits(int low, int high) {
//        int length = String.valueOf(low).length();
//         int index=0;
//         while
//
//    }

    public int searchInsert(int[] nums, int target) {

        List<Integer> intList = new ArrayList<>();
        for (int num : nums) {
            intList.add(num);
        }
        int index=0;
       if (intList.contains(target)){
           while (index<nums.length){
               if (intList.get(index) == target)
                   return index;
               index ++;
           }
       }else
       {
           intList.add(target);
           Collections.sort(intList);
           while (index<nums.length){
               if (intList.get(index) == target)
                   return index;
               index ++;
           }
       }
        return index;
    }


    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;

    }
    public int firstMissingPositive(int[] nums) {
        if (nums.length==1 && nums[0]==0){
            return 1;
        }
          Arrays.sort(nums);
          Set<Integer> set = new HashSet<>();
          int i=0;
          while (i<nums.length){
              set.add(nums[i]);
              i++;
          }

          int j=1;
          while (j<nums[nums.length-1])
          {
              if (!set.contains(j))
                  return j;

              j++;
          }


        return j;
    }

    public static void main(String[] args) {
        DsaQuestions dsaQuestions = new DsaQuestions();
        int[] num = {5,9};

        System.out.println(dsaQuestions.firstMissingPositive(num));



//        System.out.println(Arrays.toString(dsaQuestions.plusOne(num)));
//        int sum = 0;
//        for (int i = 0;i<num.length;i++){
//            sum = sum*10+ num[i];
//        }
////        System.out.println(dsaQuestions.removeDuplicates(num));
////        System.out.println((int)Math.pow(10,9));
    }
}
