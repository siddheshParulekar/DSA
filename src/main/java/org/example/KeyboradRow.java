package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class KeyboradRow {

    public String[] findWords(String[] words) {
        String[] resultSet = new String[words.length] ;
         HashMap<String,String> keyboardMap = new HashMap<>();
        keyboardMap.put("fistRow","qwertyuiop");
        keyboardMap.put("secondRow","asdfghjkl");
        keyboardMap.put("thridRow","zxcvbnm");


        for (int i=0;i<words.length-1;i++){
            for (int j = 0;j<words[i].toCharArray().length-1;j++){


            }
        }


        return resultSet;
    }

    public static int hell(){
        try {
            System.out.println("inside try ");
            return 10;
        }catch (Exception exception){
            System.out.println("Catch");
            return 12;

        }finally {
            System.out.println("insode finally");
            return 14;
        }
    }


    public static void main(String[] args) {
       // KeyboradRow keyboradRow = new KeyboradRow();
Integer[] arrayy = new Integer[1];
arrayy[0]=new Integer(12);

        System.out.println(Arrays.toString(arrayy));
    }
}
