package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class Auriga {
    public static void main(String[] args) {
        List<StringBuilder> resultList = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder("ABC");
        for (int i=0;i<=stringBuilder.length()-1;i++){
            if (i == stringBuilder.length()-1){
                continue;
            }

            resultList.add(swap(new StringBuilder(stringBuilder), i, i + 1));
            resultList.add(swap(new StringBuilder(stringBuilder), i, stringBuilder.length() - 1));

        }

        System.out.println("List..... " + resultList);
    }


  static StringBuilder swap(StringBuilder str,int index1,int index2){
       char temp = str.charAt(index1);
       str.setCharAt(index1, str.charAt(index2));
       str.setCharAt(index2, temp);
       return str;
   }
}
