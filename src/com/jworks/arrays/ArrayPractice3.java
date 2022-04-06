package com.jworks.arrays;

import java.util.Arrays;

public class ArrayPractice3 {

    /*
    Question:
    Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
*/


    public int[] sortedSquaresNaiveApproach(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }

        Arrays.sort(nums);
        return nums;
    }

    public static int[] sortedSquaresOptimalApproach(int[] numArray) {

        int n = numArray.length;

        int leftPointer = 0;
        int rightPointer = n-1;

        int[] resultArray = new int[n];

        for (int i = n-1; i >=0; i--) {

            int absLeftValue = Math.abs(numArray[leftPointer]);
            int absRightValue = Math.abs(numArray[rightPointer]);

            if(absLeftValue > absRightValue) {
                resultArray[i] = numArray[leftPointer] * numArray[leftPointer];
                leftPointer++;
            }else{
                resultArray[i] = numArray[rightPointer] * numArray[rightPointer];
                rightPointer--;
            }

        }
        return resultArray;
    }
}
