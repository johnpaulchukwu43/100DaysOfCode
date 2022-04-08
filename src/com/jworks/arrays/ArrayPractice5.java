package com.jworks.arrays;

import java.util.HashMap;
import java.util.Map;

public class ArrayPractice5 {

    /*
    * Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).

    More formally check if there exists two indices i and j such that :
    i != j
    0 <= i, j < arr.length
    arr[i] == 2 * arr[j]
    * */

    public static boolean checkIfExist(int[] arr) {

        Map<Integer,Integer> numsMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            numsMap.put(arr[i] *2, i);
        }

        for (int j : arr) {
            if (numsMap.containsKey(j) && j!= 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // sample run
        int [] nums = new int[]{-2,0,10,-19,4,6,-8};
        System.out.println(checkIfExist(nums));
    }

}
