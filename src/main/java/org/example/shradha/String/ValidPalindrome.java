package org.example.shradha.String;

public class ValidPalindrome {

    public static void main(String[] args) {
isPalindrome("A man, a plan, a canal: Panama");
    }

    public static boolean isPalindrome(String s) {
        String newString = "";

        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch) || Character.isLetter(ch)){
                newString += ch;
            }
        }

        newString  = newString.toLowerCase();

        int i = 0;
        int j = newString.length()-1;

        while(i<=j){
            if(newString.charAt(i) != newString.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;

    }
}
