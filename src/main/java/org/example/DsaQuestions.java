package org.example;

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
    public static void main(String[] args) {
        DsaQuestions dsaQuestions = new DsaQuestions();
        int[] num = {0,1,1,2};
        System.out.println(dsaQuestions.removeDuplicates(num));
    }
}
