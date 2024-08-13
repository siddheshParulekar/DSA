package org.example.blind75;

public class ProductOfArray {
    public int[] productExceptSelf(int[] nums) {

        int[] reultset = new int[nums.length];
        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];

        leftProduct[0] = 1;
        int ind = nums.length -1;
        rightProduct[ind] = 1;

        for(int i = 1;i<nums.length;i++){
            leftProduct[i] = nums[i-1] * leftProduct[i-1];
        }
        for(int i = nums.length-2;i>=0;i--){
            rightProduct[i] = nums[i+1] * rightProduct[i+1];
        }
        for(int i = 0;i<nums.length;i++){
            reultset[i] = leftProduct[i] * rightProduct[i];
        }

        return reultset;

    }

    public static void main(String[] args) {
        ProductOfArray productOfArray= new ProductOfArray();
        int[] nums = {1,2,3,4};
        productOfArray.productExceptSelf(nums);
    }
}
