package com.jworks.arrays;

public class ArrayPractice1 {

    public int findMaxConsecutiveOnes(int[] nums) {
        /*
        Question:
            Given a binary array, find the maximum number of consecutive 1s in this array.
            have a counter = 0;
            have a maxCounter = 0;
            loop through the array if current position = 1  then increment counter,
             else check for bigger btw counter & maxCounter and assign to maxCounter and reset counter =0
        */
        int counter  = 0;
        int maxCounter = 0;

        for (int num : nums) {
            if (num == 1) {
                counter += 1;

            } else {
                maxCounter = Math.max(maxCounter, counter);
                counter = 0;
            }
        }

        return Math.max(maxCounter, counter);
    }
}
