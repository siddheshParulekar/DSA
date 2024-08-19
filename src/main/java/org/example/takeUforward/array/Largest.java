package org.example.takeUforward.array;

import java.util.PriorityQueue;

public class Largest {


    public static void main(String[] args) {
        System.out.println(largest(new int[]{1,2,3,4,5}));
    }


    public static int largest(int[] arr) {
        // code here

        PriorityQueue<Integer> integers = new PriorityQueue<>();

        for (int i =0;i< arr.length;i++){
            integers.add(arr[i]);

            if (integers.size()>1){
                integers.poll();
            }


        }

        return integers.peek();
    }
}
