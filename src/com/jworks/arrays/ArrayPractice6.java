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
        System.out.println(Arrays.toString(replaceElementsNaiveApproach(nums)));
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
