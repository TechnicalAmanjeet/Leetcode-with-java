package com.Amanjeet;

class Solution {
    public int mostFrequent(int[] nums, int key) {
        int[] hasArr = new int[1001];
        for(int i=1; i<nums.length; ++i){
            if(nums[i-1] == key) hasArr[nums[i]] += 1;
        }
        int max = 0,output = 0;
        for(int i=0; i<=hasArr.length; ++i){
            if(hasArr[i] > max){
                max = hasArr[i];
                output = i;
            }
        }
//        System.out.println(hasArr[1000]);
        return output;
    }
}

public class q1 {
    public static void main(String[] args) {

    }
}
