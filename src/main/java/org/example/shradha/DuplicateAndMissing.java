package org.example.shradha;

import java.util.*;

public class DuplicateAndMissing {

    public static void main(String[] args) {
List<Integer> list = List.of(2,1,4,4);
        repeatedNumber(list);
    }

    //[3 1 2 5 3]
    public static void repeatedNumber(final List<Integer> A) {
        Integer[] array = A.toArray(new Integer[0]);
        List<Integer> l1 = new ArrayList<>(A);
        int i = 0;
        while (i<array.length){
            int idealIndex=  array[i]-1;

            if (array[i] != array[idealIndex]){
                swap(array,i,idealIndex);
            }else
                i++;
        }


        System.out.println(Arrays.toString(array));

        HashSet<Integer> set = new HashSet<>();
Set<Integer> result = new HashSet<>();


        for(int x = 0;x<array.length;x++){
            if (!set.add(array[x]))
                result.add(array[x]);
            if (array[x]-1!= x)
                result.add(x+1);

        }

        System.out.println(result);

    }

    public static void swap(Integer[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
}
