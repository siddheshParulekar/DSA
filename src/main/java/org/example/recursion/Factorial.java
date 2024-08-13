package org.example.recursion;

public class Factorial {


          public int factorial(int n){
              if (n<2)
                  return n;
              return n*factorial(n-1);
          }

    public static void main(String[] args) {
Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(5));

    }
}
