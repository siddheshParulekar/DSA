package org.example.sorting;

import java.util.*;

public class FrequecySort {

    public static void main(String[] args) {
        int[] res = {1,2,2,3};
        System.out.println(Arrays.toString(frequencySort(res)));
    }

    public static int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> freMap = new HashMap<>();
        for(int n : nums){
            freMap.put(n,freMap.getOrDefault(n,0)+1);
        }

        List<Integer> list =new ArrayList<>(freMap.keySet());
        Collections.sort(list,(a,b)->{
            if (freMap.get(a) == freMap.get(b))
                return b-a;
            else
                return freMap.get(a) - freMap.get(b);
        });

        int[] res = new int[nums.length];
       int index =0;
       for (int i: list){
           for (int j = 0;j<freMap.get(i);j++){
               res[index++] = i;
           }
       }

       return res;
    }
}
