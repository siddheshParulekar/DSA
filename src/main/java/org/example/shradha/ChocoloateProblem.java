package org.example.shradha;

import java.util.Arrays;

public class ChocoloateProblem {

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
chocolateDistribution(arr,3);
    }

  static  void chocolateDistribution(int[] arr,int m){
      Arrays.sort(arr);
      int min = Integer.MAX_VALUE;
      for (int i =0;i< arr.length-m;i++){
            min = Math.min(min,arr[i+(m-1)] - arr[i]);
      }
      System.out.println(min);
    }
}
