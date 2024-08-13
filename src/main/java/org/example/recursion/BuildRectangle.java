package org.example.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class BuildRectangle {

    public static int[] constructRectangle(int area) {
        List<int[]> factorsList = new ArrayList();

        for(int i= 1 ; i<=area ;i++ ){
            if(area%i == 0){
                factorsList.add(new int[]{i,area/i});
            }
        }
      factorsList.forEach(e-> System.out.println(Arrays.toString(e)));
        factorsList.removeIf(factor -> factor[0] < factor[1]);

        System.out.println("-----------------------------");
        factorsList.forEach(e-> System.out.println(Arrays.toString(e)));
        int min = 0;
        for (int i = 1;i<factorsList.size();i++){
            if (factorsList.get(i)[0]-factorsList.get(i)[1] <factorsList.get(i-1)[0]-factorsList.get(i-1)[1])
                min = i;
        }
        return factorsList.get(min);

    }

    public static void main(String[] args) {
        System.out.println("outpit......."+Arrays.toString(constructRectangle(122122)));
    }
}
