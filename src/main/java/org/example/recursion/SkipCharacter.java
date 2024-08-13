package org.example.recursion;

public class SkipCharacter {
    StringBuilder result = new StringBuilder();
    public String skipCharacter(String s1,char target){
        if (s1.isEmpty())
            return result.toString();
        if (s1.charAt(0) != target)
            result.append(s1.charAt(0));
       return skipCharacter(s1.substring(1),target);
    }

    public static void main(String[] args) {
        SkipCharacter character = new SkipCharacter();
        String a = "bacaab";
        char target ='a';
        System.out.println(character.skipCharacter(a,target));
    }
}
