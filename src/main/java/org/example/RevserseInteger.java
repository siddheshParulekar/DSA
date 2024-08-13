package org.example;

public class RevserseInteger {

    public int reverse(int x) {
        int num = Math.abs(x);
        int sum = 0;
        while (num>0){
           int rem = num%10;
           sum = sum*10 + rem;
           num= num/10;

        }
        if (sum > (Integer.MAX_VALUE ) /10)
            return 0;

        return x<0?(-sum):sum;
    }

    public boolean isSameAfterReversals(int num) {
        int x = Math.abs(num);
        int reversed1 = 0;
        while (x > 0) {
            int rem = x % 10;
            reversed1 = reversed1 * 10 + rem;
            x = x / 10;

        }

        int reversed2 = 0;
        while (reversed1 > 0) {
            int rem = reversed1 % 10;
            reversed2 = reversed2 * 10 + rem;
            reversed1 = reversed1 / 10;
        }
        return num == reversed2;
    }


    public static void main(String[] args) {
RevserseInteger revserseInteger = new RevserseInteger();
        System.out.println(revserseInteger.reverse(-123));
    }
}
