package com.Amanjeet;

import java.util.Arrays;

class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int[] output = new int[nums.length];
        int[] num = new int[nums.length];
        for(int i=0; i<num.length; ++i){
            String number = Integer.toString(nums[i]);
            int n = 0;
            for(int j = 0; j<number.length(); ++j){
                n = n*10 + mapping[Character.getNumericValue(number.charAt(j))];
            }
            num[i] = n;
        }
        int[][] ar = new int[nums.length][2];
        for(int i = 0; i<num.length; ++i){
            ar[i][0] = num[i];
            ar[i][1] = nums[i];
        }

        Arrays.sort(num);

        return num;
    }
}

public class q2 {
}
