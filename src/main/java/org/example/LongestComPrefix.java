package org.example;

import java.util.Arrays;

public class LongestComPrefix {

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        int startIndex = 0;
        while (startIndex < str1.length() && startIndex<str2.length()){
            if (str1.charAt(startIndex) != str2.charAt(startIndex))
                break;
           startIndex++;
        }
        return str1.substring(0,startIndex);
    }

    public static void main(String[] args) {
        String[] strs = {"flow","flight","flower"};
LongestComPrefix longestComPrefix = new LongestComPrefix();
        System.out.println(longestComPrefix.longestCommonPrefix(strs));
    }
}
