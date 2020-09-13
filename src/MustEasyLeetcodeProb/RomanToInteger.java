package MustEasyLeetcodeProb;

import java.util.HashMap;

//https://leetcode.com/problems/roman-to-integer/

public class RomanToInteger {

    public static void main(String[] args) {
        String s = "MCMXCIV";
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt(s));
    }

    public int romanToInt(String s) {

        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        char[] chars = s.toCharArray();
        int ans = 0;
        for (int i = 0; i < chars.length; i++) {
            ans += romanMap.get(chars[i]);
        }

        if (s.contains("IV") || s.contains("IX")) {
            ans = ans - 2;
        }
        if (s.contains("XL") || s.contains("XC")) {
            ans = ans - 20;
        }
        if (s.contains("CD") || s.contains("CM")) {
            ans = ans - 200;
        }
        return ans;
    }
}