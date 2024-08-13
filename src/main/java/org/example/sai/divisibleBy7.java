package org.example.sai;

public class divisibleBy7 {

   private boolean isDivisible(int n){
       for(int i = 1;i<n;i++){
           if (i*7 == n)
               return true;
       }
       return false;
   }

    public static void main(String[] args) {
        divisibleBy7 divisibleBy7 = new divisibleBy7();
        System.out.println(divisibleBy7.isDivisible(79));
    }
}
