package org.example.shradha;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class findSubArrayWithSum {

    public static void main(String[] args) {

        System.out.println(findsum2(new int[]{4,2,-3,1,6},5));

    }


    //working O(n2)
    static boolean findsum(int arr[],int n)
    {
        for(int i = 0;i<arr.length;i++){
            int sum = arr[i];
            int j = i+1;
            while(j< arr.length){
                sum  = sum + arr[j];
                if (sum == 0)
                    return true;
                j++;
            }

        }
        return false;

        //Your code here

    }

    static boolean findsum2(int arr[],int n)
    {
        HashSet<Integer> find=new HashSet<Integer>();
        int prefixsum=0;
        for(int i=0;i<n;i++){

            prefixsum+=arr[i];
            if(find.contains(prefixsum) || prefixsum==0){
                return true;
            }
            find.add(prefixsum);
        }
        return false;

        //Your code here

    }
}
