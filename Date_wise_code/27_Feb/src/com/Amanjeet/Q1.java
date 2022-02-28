package com.Amanjeet;

import java.lang.reflect.Type;

class Solution1 {
    public int mostWordsFound(String[] sentences) {
        int maxWord = -1;
        String a = "am n";
        char c = a.charAt(2);
//        System.out.println("a"+c + "b");
        for(String sentence : sentences){
            int currentWord = 0;
            for(int i=0; i<sentence.length(); ++i){
                char s = sentence.charAt(i);
//                System.out.println(Character.compare(s,c));
                if(Character.compare(s,c) == 0){
                    currentWord += 1;
                }
            }
//            System.out.println(sentence);
//            System.out.println(currentWord);
            currentWord += 1;
            if(currentWord > maxWord){
                maxWord = currentWord;
            }
        }
        return maxWord;
    }
}

public class Q1 {


    public static void main(String[] args) {
        String[] s = {"w jrpihe zsyqn l dxchifbxlasaehj","nmmfrwyl jscqyxk a xfibiooix xolyqfdspkliyejsnksfewbjom","xnleojowaxwpyogyrayfgyuzhgtdzrsyococuqexggigtberizdzlyrdsfvryiynhg","krpwiazoulcixkkeyogizvicdkbrsiiuhizhkxdpssynfzuigvcbovm","rgmz rgztiup wqnvbucfqcyjivvoeedyxvjsmtqwpqpxmzdupfyfeewxegrlbjtsjkusyektigr","o lgsbechr lqcgfiat pkqdutzrq iveyv iqzgvyddyoqqmqerbmkxlbtmdtkinlk","hrvh efqvjilibdqxjlpmanmogiossjyxepotezo","qstd zui nbbohtuk","qsdrerdzjvhxjqchvuewevyzlkyydpeeblpc"};
        Solution1 S = new Solution1();
        int output = S.mostWordsFound(s);
        System.out.println(output);
    }
}
