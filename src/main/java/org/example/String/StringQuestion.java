package org.example.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringQuestion {

    public static void main(String[] args) {
        String s = "Myself2 Me1 I4 and3";
        String[] sarray = s.split(" ");
        String[] op= new String[sarray.length];
        StringBuilder sb = new StringBuilder();

        for (String s1 : sarray) {
            Integer index = Integer.parseInt(String.valueOf(s1.charAt(s1.length() - 1)));
            op[index-1] = s1.substring(0,s1.length()-1);
        }
        for (String s1 : op){
            sb.append(s1).append(" ");
        }

        StringQuestion stringQuestion = new
                StringQuestion();
        stringQuestion.toLowerCase("Hello");

    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        return String.join("",word1).equals(String.join("",word2));

    }

    public String toLowerCase(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<arr.length;i++){
            char ch= arr[i];
            if((int) ch <=96){
                int ascii = (int) ch +32;
                arr[i] = (char)ascii;
            }
        }

        for (char ch: arr){
            sb.append(ch);
        }
        return sb.toString();
    }

    public boolean halvesAreAlike(String s) {
        List<Character> list = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        String a = s.substring(0,s.length()/2);
        String b = s.substring(s.length()/2);
        int aCount = 0;
        int bCount = 0;

        for(int i = 0;i<a.length();i++){
            if(list.contains(a.charAt(i)))
                aCount++;
        }
        for(int i = 0;i<b.length();i++){
            if(list.contains(b.charAt(i)))
                bCount++;
        }

        return bCount== aCount;

    }

    public int maxRepeating(String sequence, String word) {
        int count = 0;
        StringBuilder sb= new StringBuilder(word);

        if(sequence.contains(sb.toString())){
           return containsCheck(sequence,sb,count,word);
        }else{
            return count;
        }
        //return count;

    }

    public int containsCheck(String sequnece,StringBuilder sb,int count,String word){
        while (sequnece.contains(sb.toString())){
            count++;
            sb.append(word);
        }

        return count;

    }

//    public List<String> letterCombinations(String digits) {
//        Map<Integer,String> map= new HashMap<>();
//        map.put(2,"abc");
//        map.put(3,"def");
//        map.put(4,"ghi");
//        map.put(5,"jkl");
//        map.put(6,"mno");
//        map.put(7,"pqrs");
//        map.put(8,"tuv");
//        map.put(9,"wxyz");
//
//        List<String> stringList =new ArrayList<>();
//        for (int i =0;i<digits.length();i++){
//            int key = Integer.parseInt(String.valueOf(digits.charAt(i)));
//            String s = map.get(key);
//        }
//
//    }
}
