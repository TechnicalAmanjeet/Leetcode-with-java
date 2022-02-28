package com.Amanjeet;

class Solution {

    public int countValidWords(String sentence) {
        int a = (int)'a', z = (int)'z';  // taking ascii value of a and z.
        int correctWord = 0; // will output as correct word.
        boolean b = true; // by using this flag, will check whether bad char is in the word or not.
        char dash = ' '; // char of " "

        for(int i=0;i<sentence.length(); ++i){
            char c = sentence.charAt(i);
            int as = (int)c;
            if(Character.compare(c,dash) == 0 || i == sentence.length() - 1){
                if (b ){
                    System.out.println(sentence.charAt(i-1));
                    correctWord += 1;
                }
                b = true;
                continue;
            }

            if(! (as>=a && as<=z)){
                b = false;
            }
        }

        return correctWord;
    }
}


public class q2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "alice and  bob are playing stone-game10";
        int out = s.countValidWords(str);
        System.out.println(out);
    }
}
