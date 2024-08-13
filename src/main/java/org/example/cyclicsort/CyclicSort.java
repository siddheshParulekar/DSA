package org.example.cyclicsort;

import java.util.Arrays;
import java.util.List;

public class CyclicSort {

    public void sort(int[] arr){
        Arrays.asList(arr);
        int i=0;
        while(i< arr.length)
        {
            int correctIndex = arr[i];
            if (arr[i] != arr[correctIndex])
                swap(arr,i,correctIndex);
            else {
                i++;
            }

        }
    }
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }

    public static void main(String[] args) {
        int[] arr={2,3,1,0,4,1};
        CyclicSort cyclicSort = new CyclicSort();
        cyclicSort.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
