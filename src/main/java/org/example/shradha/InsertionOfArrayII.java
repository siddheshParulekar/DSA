package org.example.shradha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionOfArrayII {

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] result = new int[nums1.length * nums2.length];
        int i=0,j=0,k=0;

        while (i<nums1.length && j<nums2.length){
            if (nums1[i]< nums2[j]){
                i++;
            } else if (nums2[j]< nums2[i]) {
                j++;
            }else {
                result[k++] =nums1[i++];
                j++;
            }
        }

        return Arrays.copyOfRange(result,0,k);
    }

    public static void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(arr1,arr2)));
    }
}
