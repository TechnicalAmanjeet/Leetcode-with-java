package com.Amanjeet;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> cellsInRange(String s) {
        ArrayList<String> list = new ArrayList<>();
//        List<String> output = new ArrayList<>();
        char first = s.charAt(0), last = s.charAt(3);
        int start = Character.getNumericValue(s.charAt(1)), end = Character.getNumericValue(s.charAt(4));
        int startch = (int)first, endch = (int)last;
//        System.out.println(first + " " + last);
//        System.out.println(start+ " " + end);
        for(int i= startch;i<=endch;++i){
            for(int j=start;j<=end;++j){
                String ch = Character.toString((char)i) + Integer.toString(j);
                list.add(ch);
            }
        }

        return list;
    }
}

public class q1 {
}
