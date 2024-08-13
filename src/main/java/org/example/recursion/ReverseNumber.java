package org.example.recursion;

public class ReverseNumber {
    int sum =0;
    public int reverse(int x) {

        recu(x);
       return sum;
    }

    public void recu(int x){
        if(x == 0)
            return ;

        int rem = x%10;
        sum = sum *10+rem;
        recu(x/10);
    }

    public static void main(String[] args) {
        ReverseNumber reverseNumber = new ReverseNumber();
        System.out.println(reverseNumber.reverse(-123));
    }
}
