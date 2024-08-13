package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[]arr= {11,23,45,67,2,3,4,6,7,8};
        int inedx= 0;
        for (int i =2;inedx< arr.length;i++){
            System.out.println(arr[inedx]);
            inedx = inedx+i;
        }
    }
}