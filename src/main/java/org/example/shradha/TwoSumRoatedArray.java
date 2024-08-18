package org.example.shradha;

import java.util.HashMap;

public class TwoSumRoatedArray {


    public static void main(String[] args) {

        System.out.println(twoSum(new int[]{11, 15, 6, 8, 9, 10},1));
    }


    public static Boolean twoSum(int[] arr,int x){
        HashMap<Integer,Integer> keyHashMap = new HashMap<>();

        for (int i =0 ;i< arr.length;i++){
            keyHashMap.put(arr[i],i );

            if (keyHashMap.containsKey(x- arr[i]))
                return true;
        }

        return false;
    }
}
