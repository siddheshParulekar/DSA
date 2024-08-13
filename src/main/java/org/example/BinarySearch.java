package org.example;

public class BinarySearch {



    public int  findElementFromArray(int arr[] , int target){
        int start = 0;
        int end = arr.length-1;


        while(start <= end){
            int mid = (start + end)/2;

            if (target > arr[mid])
                start = mid +1;
            else if (target < arr[mid]) {
                end = mid -1;
            }else
                return mid;
        }

        return -1;


    }



    public int[] searchRange(int[] nums, int target) {

        int[] ansSet = {-1,-1};
        ansSet[0] = search(nums,target,true);
        ansSet[1] = search(nums,target,false);

        return ansSet;

    }

    public int search(int[] nums,int target,boolean isStartIndex){
        int start = 0;
        int ans= -1;
        int end = nums.length-1;

        while(start<=end){
            int mid = (start + end)/2;
            if(target< nums[mid])
                end = mid -1;
            else if(target > nums[mid])
                start = mid +1;
            else{
                ans = mid;
                if(isStartIndex)
                    end= mid -1;
                else
                    start = mid +1;
            }

        }
        return ans;

    }


    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;


        while(start <= end){
            int mid = (start + end)/2;

            if (target > letters[mid])
                start = mid +1;
            else  {
                end = mid -1;
            }
        }

        return letters[start % letters.length];
    }

    public int searchInRotatedArray(int nums[],int target){
        int l= 0;
        int r = nums.length-1;
        while(l<=r){
            int mid= l + (r-l)/2;
            if (nums[mid] == target)
                return mid;

            if(nums[l] <nums[mid]){
                if (target>=nums[l] && target<=nums[mid])
                    r = mid-1;
                else
                    l = mid+1;
            }else if (nums[mid] < nums[r]){
                if (target>=nums[mid+1] && target<=nums[r])
                    l= mid+1;
                else
                    r = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        BinarySearch binarySearch = new BinarySearch();
        int[] egArray = {2,3,6,8,9};
        int[] rotatedArray = {4,5,6,7,0,1,2};

        System.out.println(binarySearch.searchInRotatedArray(rotatedArray,3));
       // System.out.println(binarySearch.findElementFromArray(egArray,1));
    }
}
