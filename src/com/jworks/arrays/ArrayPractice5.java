package com.jworks.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayPractice5 {

    /*
    * Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).

    More formally check if there exists two indices i and j such that :
    i != j
    0 <= i, j < arr.length
    arr[i] == 2 * arr[j]
    * */

    public static boolean checkIfExist(int[] arr) {

        Set numSet = new HashSet<>();


        for (int num : arr) {
            if (numSet.contains(num)) {
                return true;
            }

            if (num % 2 == 0) {
                numSet.add(num / 2);
            }

            numSet.add(num * 2);
        }

        return false;
    }

    public static void main(String[] args) {
        // sample run
        int [] nums = new int[]{0,0};
        System.out.println(checkIfExist(nums));
    }

}
