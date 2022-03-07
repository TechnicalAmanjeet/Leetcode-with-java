package com.Amanjeet;

import java.util.Arrays;

class Solution1 {
    public long minimalKSum(int[] nums, int k) {
        // m1
//        int[] hashArr = new int[1000000000];
//        long sum = 0;
//        for(int element : nums){
//            hashArr[element] += 1;
//        }
//        int i = 1;
//        while (k!=0){
//            if(hashArr[i] == 0){
//                System.out.print(i + " ");
//                sum += i;
//                k--;
//            }
//            i+=1;
//        }
//        return sum;

        // m2
        Arrays.sort(nums);
        long sum = 0;
        int i=1;
        for(int j=1;j<nums[0];++j){
            if(k>0){
                sum += j;
                System.out.print(sum + " ");
                k--;
            }
            else{
                return sum;
            }
        }

        while (k!=0 && i != nums.length){
            for(int j=nums[i-1];j<nums[i];++j){
                if(k>0){
                    sum += j;
                    System.out.print(sum + " ");
                    k--;
                }
                else {
                    return sum;
                }
            }
            i += 1;
        }
        int p = nums[nums.length-1] + 1;
        while (k!=0){
            sum += p;
            System.out.print(sum + " ");
            p+=1;
            k--;
        }
        return sum;
    }
}

public class q2 {
}
