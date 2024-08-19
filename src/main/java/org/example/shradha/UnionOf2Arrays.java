package org.example.shradha;

import java.util.*;

public class UnionOf2Arrays {

    public static void main(String[] args) {
        int[] arr1 = {1,3,6,4,5,8};
        int[] arr2= {5,2};
        unionOfArrays(arr1,arr2);
        union(arr1,arr2);
    }

// without hashset
   static void unionOfArrays(int[] arr1,int[] arr2){
       List<Integer>  res = new ArrayList<>();
       Arrays.sort(arr1);
       Arrays.sort(arr2);

       //o/p: 1,2,3,4,5,6,8

       int i = 0;
       int j = 0;
       while(i<arr1.length && j<arr2.length){
           if (arr1[i]<arr2[j]){
               res.add(arr1[i]);
               i++;
           } else if (arr1[i]>arr2[j]) {
               res.add(arr2[j]);
               j++;
           }else {
               res.add(arr1[i]);
               i++;
               j++;
           }
       }

       while (i<arr1.length){
           res.add(arr1[i]);
           i++;
       }
       while (j<arr2.length){
           res.add(arr1[j]);
           j++;
       }
       System.out.println(res);
    }

  static  void union(int[] arr1,int[] arr2){
      HashSet<Integer> set = new HashSet<>();
      for (int j : arr1) {
          set.add(j);
      }

      for (int i : arr2) {
          set.add(i);
      }

      System.out.println(set);
    }
    static int[] intersection(int[] arr1,int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> inet = new HashSet<>();
        for (int i: arr1){
            set.add(i);
        }
        for (int j: arr2){
            if (set.contains(j)){
                inet.add(j);
            }
        }
        int[] result = new int[inet.size()];
        int k = 0;
        for (Integer i : inet){
            result[k++] = i;
        }

        return result;

    }




    //GFG sorted

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        HashSet<Integer> set = new HashSet<>();
        for (int j : arr1) {
            set.add(j);
        }

        for (int i : arr2) {
            set.add(i);
        }

        ArrayList<Integer> integers = new ArrayList<>(set);
        Collections.sort(integers);
        return integers;
    }
}
