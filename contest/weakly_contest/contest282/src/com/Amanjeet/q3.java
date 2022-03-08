package com.Amanjeet;

class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long out = 1;
        while (out > 0){
            for(int el : time){
                if(out%el == 0) totalTrips -= 1;
            }
            if(totalTrips <= 0) return out;
            out += 1;
        }
        return out;
    }
}

public class q3 {
}
