package org.example;

public class Palindrome {

    //with help
    public boolean isPalindrome(int x) {
       int originalNumber = x;
       int afterReverseNumver = 0;
        while(x>0){
            int reminder = x % 10;
            afterReverseNumver = afterReverseNumver *10 +reminder;
            x =x/10;

        }
        return originalNumber == afterReverseNumver;

    }

    public static void main(String[] args) {
Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(122));
    }
    }
