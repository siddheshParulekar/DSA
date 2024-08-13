package org.example;

import java.util.*;

public class LongestComPrefix {

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        int startIndex = 0;
        while (startIndex < str1.length() && startIndex<str2.length()){
            if (str1.charAt(startIndex) != str2.charAt(startIndex))
                break;
           startIndex++;
        }
        return str1.substring(0,startIndex);
    }

    public int mySqrt(int x) {
        if (x == 1)
            return 1;
        long i=1;
        while (i<x/2){
            if (i*i == x)
                return (int) i;
            else{
                if ((i+1) *(i+1) >x)
                    return (int) i;
            }
            i++;
        }
          return 0;
    }

    public int climbStairs(int n) {

        if (n==0 || n==1 ||n==2){
            return n;
        }
        int resultset[] = new int[n+1];
        resultset[0]=0;
        resultset[1]=1;
        resultset[2] =2;

        for (int i=3;i<=n;i++){
            resultset[i] = resultset[i-1] +resultset[i-2];
        }
        return resultset[n];
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode current= head;
        while (current.next!= null && current!=null){
            if (current.val == current.next.val)
                current.next = current.next.next;
            else
                current  = current.next;
        }
        return head;
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {

             for (int j =0;j<n;j++){
                     nums1[j+m] =nums2[j];

             }
             Arrays.sort(nums1);

    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> uniqueset = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            int k = nums.length-1;
            for (int j=i+1;j< nums.length;j++){
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

    public static void main(String[] args) {
        String[] strs = {"flow","flight","flower"};
        LongestComPrefix longestComPrefix = new LongestComPrefix();
        System.out.println(longestComPrefix.longestCommonPrefix(strs));
    }

}
