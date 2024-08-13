package org.example;

import java.util.Arrays;

public class FibonacciSeries {

    public void fibonacci(int n){
        int result[] = new int[n];
        for (int i=0;i<n;i++){
            result[i] = fib(i);
        }
        System.out.println(Arrays.toString(result));
    }
    //with recursion
    public Integer fib(Integer n) {
        if (n<2)
            return n;
        return fib(n-1) + fib(n-2);
    }

    public void fibWithoutRec(int n){

        int[] fibSer = new int[n];
        fibSer[0] = 0;
        if (n>1)
            fibSer[1] = 1;

        for (int i =2;i<n;i++){
            fibSer[i]= fibSer[i-1] + fibSer[i-2];
        }

        System.out.println(Arrays.toString(fibSer));
    }

    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries = new
                FibonacciSeries();
        fibonacciSeries.fibonacci(6);

        fibonacciSeries.fibWithoutRec(1);
    }
}
