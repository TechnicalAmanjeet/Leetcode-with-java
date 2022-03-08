package com.Amanjeet;

class Solution {
    public int prefixCount(String[] words, String pref) {
        int output = 0;
        for(String word : words){
            int l = 0;
            for(int i=0;i<pref.length();++i){
                if(word.length() < pref.length()){
                    continue;
                }
                if(word.charAt(i) != pref.charAt(i)){
                    l = 1;
                    break;
                }
            }
            if(l==0) output += 1;
        }
        return output;
    }
}

public class q1 {

}
