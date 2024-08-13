package org.example;

public class Count1 {

    static int countDigitOne(int n)
    {
        int countr = 0;
        for (int i = 1; i <= n; i++)
        {
            String str = String.valueOf(i);
            countr += str.split("1", -1) . length - 1;
        }
        return countr;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int n = 13;
        System.out.println(countDigitOne(n));
        n = 131;
        System.out.println(countDigitOne(n));
        n = 159;
        System.out.println(countDigitOne(n));
    }
}
