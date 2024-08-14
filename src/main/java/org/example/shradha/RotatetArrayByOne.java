package org.example.shradha;

import java.util.Arrays;

public class RotatetArrayByOne {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotateArray(arr);

    }

    static void rotateArray(int[] arr){


        for (int i = 1;i< arr.length;i++){
            swap(0,i,arr);

        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
