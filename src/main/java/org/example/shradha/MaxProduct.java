package org.example.shradha;

public class MaxProduct {

    public static void main(String[] args) {

    }

    public int maxProduct(int[] nums) {

        int currentProduct = nums[0];
        int maxPro = currentProduct;

        for(int i =1;i<nums.length;i++){
            currentProduct = Math.max(nums[i]*currentProduct,nums[i]);
            maxPro = Math.max(maxPro,currentProduct);

        }
        return maxPro;

    }
}
