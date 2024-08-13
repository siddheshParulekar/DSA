package org.example.recursion;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int [] arr = {2,4,3,6,1,8};
        System.out.println(Arrays.toString(mergeSort(arr)));


    }

    public  static int[] mergeSort(int[] arr){
        if (arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right =mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);

    }

    public static int[] merge(int[] firstHalf,int[] secondHalf){

        int[] resultArr = new int[firstHalf.length+secondHalf.length];
        int i =0 ;
        int j =0;
        int k = 0;

        while(i< firstHalf.length && j<secondHalf.length){
            if (firstHalf[i] < secondHalf[j]){
                resultArr[k] = firstHalf[i];
                i++;
            }else {
                resultArr[k] = secondHalf[j];
                j++;
            }
            k++;
        }

        while (i<firstHalf.length){
            resultArr[k] = firstHalf[i];
            i++;
            k++;
        }

        while (j<secondHalf.length){
            resultArr[k] = secondHalf[j];
            j++;
            k++;
        }

        return resultArr;

    }
}
