package org.example.shradha.String;

import java.util.HashMap;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }



    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        HashMap<Character,Integer> map = new HashMap<>();

        for(Character ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        HashMap<Character,Integer> map2 = new HashMap<>();

        for(Character ch : t.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }

        return map.equals(map2);
    }
}
