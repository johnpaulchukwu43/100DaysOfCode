package com.jworks.arrays;

import java.util.Arrays;

public class ArrayPractice6 {

    /*
    * Given an array arr, replace every element in that array with the greatest element among the elements to its right,
    *  and replace the last element with -1.
        After doing so, return the array.
    * */

    public static void main(String[] args) {
        // sample run
        int [] nums = new int[]{17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElementsMoreOptimalApproach(nums)));
    }

    public static int[] replaceElementsNaiveApproach(int[] arr) {

        /*
        * 1. Loop through Array ARR
        * 2. For every item I in ARR:
        *   i. Check for the largest number after I, and replace I with the largest value found
        *   ii. If there is no number after I then return -1
        *
        * Not so optimal, as runtime complexity would be 0(n^2)
        * */
        int i = 0;
        int length = arr.length;
        while(i < length){
            int max = findMax(arr, i+1);
            arr[i] = max;
            i+=1;
        }

        arr[length - 1] = -1;

        return arr;
    }

    public static int[] replaceElementsMoreOptimalApproach(int[]arr){
        /*
        * 1. Initialize the CURRENT_RIGHT_MOST_MAX_VALUE = -1
        *
        * 2. Loop through Array ARR in reverse order
        *
        * 3. Assign  CURRENT_RIGHT_MOST_MAX_VALUE to a TEMP container
        *
        * 4. If current item I in ARR is greater than the CURRENT_RIGHT_MOST_MAX_VALUE then assign set new CURRENT_RIGHT_MOST_MAX_VALUE as I
        *
        * 5. Then set I as TEMP
        *
        * */

        int currentRightMostValue = -1;

        for (int i = arr.length - 1; i >= 0 ; i--) {

            int temp = currentRightMostValue;

            if(currentRightMostValue < arr[i]) currentRightMostValue = arr[i];

            arr[i] = temp;
        }

        return arr;
    }

    public static int findMax(int []arr, int positionToStartFrom){

        int largest = -1;

        for (int i = positionToStartFrom; i < arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        return largest;
    }
}
