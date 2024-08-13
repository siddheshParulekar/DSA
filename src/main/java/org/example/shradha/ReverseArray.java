package org.example.shradha;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        int[] rev = new int[arr.length ];
        int j =0;
        for (int i = arr.length-1;i>=0;i--){

            rev[j] = arr[i];
            j++;
        }

        System.out.println(Arrays.toString(rev));
    }
}
