package com.Amanjeet;

import java.util.HashMap;

class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();

        for(int i = 0;i<s.length();++i){
            if(h1.get(s.charAt(i)) == null){
                h1.put(s.charAt(i), 1);
            }
            else{

            h1.put(s.charAt(i), h1.get(s.charAt(i))+1);
            }
            System.out.print(h1.get(s.charAt(i))+ " ");
        }
        System.out.println();
        for(int i=0;i<t.length();++i){
            if(h2.get(t.charAt(i)) == null){
                h2.put(t.charAt(i), 1);
            }
            else{
            h2.put(t.charAt(i), h2.get(t.charAt(i))+1);

            }
            System.out.println(h2.get(t.charAt(i)));
        }
        int out = 0;
        for(Character ch : h1.keySet()){
            if(h2.containsKey(ch)){
                if(h1.get(ch) - h2.get(ch) > 0) out += h1.get(ch) - h2.get(ch);
            }
            else{
                out += h1.get(ch);
            }
        }

        for(Character ch : h2.keySet()){
            if(h1.containsKey(ch)){
                if(h2.get(ch) - h1.get(ch) > 0) out += h2.get(ch) - h1.get(ch);
            }
            else {
                out += h2.get(ch);
            }
        }
        return out;
    }
}

public class q2 {
}
