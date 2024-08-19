package org.example.Babbar;

public class MinSubArray {
    public static void main(String[] args) {

    }

    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here


        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int sum = 0;
        int len = 0;


        while(right< arr.length){
            sum = sum + arr[right];
            if (sum> x){
                len = right - left +1;
                minLen = Math.min(len,minLen);

                while(left<right && sum>x){
                    sum = sum - arr[left];
                    left++;

                    if (sum> x){
                        len = right - left +1;
                        minLen = Math.min(len,minLen);
                    }

                }
            }
            right++;
        }

        return minLen == Integer.MAX_VALUE? 0: minLen;
    }
}
