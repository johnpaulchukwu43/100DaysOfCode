package com.jworks.arrays;

public class ArrayPractice2 {

    /*
    * Given an array nums of integers, return how many of them contain an even number of digits.
    *
    * Input: nums = [12,345,2,6,7896]
      Output: 2
     * */

    public int findNumbersNaiveApproach(int[] nums) {

        int evenCounter = 0;

        for (int i = 0; i < nums.length; i++) {
            //we convert integer to string and get the string length, not so optimal , are we?
            int numOfDigits = String.valueOf(nums[i]).length();
            if(numOfDigits % 2 == 0) evenCounter+=1;
        }

        return evenCounter;
    }

    public int findNumbersMoreOptimalApproach(int[] nums) {

        int evenCounter = 0;

        for (int i = 0; i < nums.length; i++) {
            int numOfDigits = getNumOfDigits(nums[i]);
            if(numOfDigits % 2 == 0) evenCounter+=1;
        }

        return evenCounter;
    }

    public static int getNumOfDigits(int number){
        //keep dividing by 10 until it's not possible.
        int digitCount = 1;

        while((number /= 10) != 0){
            digitCount++;
        }
        return digitCount;
    }





}
