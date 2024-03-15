package org.example;

import java.util.HashMap;
import java.util.Map;

public class RomanToNumber {

//without help
    public int romanToInt(String s) {
        Map<Character,Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);
        int sum= 0 ;
        for (int i = 0; i<s.length();i++){
            if ((i< s.length() -1) && ((s.charAt(i)== 'I' && s.charAt(i+1) == 'V') || (s.charAt(i)== 'I' && s.charAt(i+1) == 'X') ||
                    (s.charAt(i)== 'X' && s.charAt(i+1) == 'L') || (s.charAt(i)== 'X' && s.charAt(i+1) == 'C') ||
                    (s.charAt(i)== 'C' && s.charAt(i+1) == 'D') || (s.charAt(i)== 'C' && s.charAt(i+1) == 'M'))){
                sum = sum + (romanMap.get(s.charAt(i+1)) - romanMap.get(s.charAt(i)));
                i++;
            }else {
                sum= sum+ romanMap.get(s.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
     RomanToNumber romanToNumber = new RomanToNumber();
        System.out.println(romanToNumber.romanToInt("MCMXCIV"));
    }
}
