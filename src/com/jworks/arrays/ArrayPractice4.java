package com.jworks.arrays;

import java.util.LinkedList;
import java.util.Queue;

public class ArrayPractice4 {

    /*
    * Question:
    *
    * Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
      Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
      *
      * Input: arr = [1,0,2,3,0,4,5,0]
        Output: [1,0,0,2,3,0,0,4]
    * */

    public void duplicateZerosNaiveApproach(int[] arr) {

        /*
        * 1. Loop through the array ARR
        *
        * 2. if current item I in ARR equals to 0 then:
        *   a. shift all elements on the right of I by one
        *
        * Solution has a runtime complexity of O(n^2) because we loop the array and in that loop, we loop through again to shift the elements when a 0 is encountered.
        * */

        int i = 0;
        int length = arr.length -1;
        while(i < length){
            if(arr[i] == 0){
                for (int j = length - 1; j >= i; j--) {
                    arr[j+1] = arr[j];
                }
                arr[i] = 0;
                i+=2;
            }else{
                i+=1;
            }
        }
    }

    public void duplicateZerosOptimalApproach(int [] arr){

        /*
        * For this approach we make use of a Queue
        * 1. Loop through the array ARR
        * 2. Add current element I in ARR to Queue Q
        * 3. If the current element I equals 0 then:
        *   a. we add to 2 zeros to the Q
        * else:
        *   we add the current element I to the Q
        * 4. Next we replace current element I in Arr with the first on the Q.
         *
         * Solution has a runtime complexity of O(n) because we loop the array once and all other operations (queueing & de-queueing are done in constant time)
        * */

        Queue<Integer> numQueue = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            int currentItem = arr[i];
            if(currentItem == 0){
                numQueue.add(0);
                numQueue.add(0);
            }else{
                numQueue.add(currentItem);
            }

            Integer firstOnQueue = numQueue.poll();

            arr[i] = firstOnQueue;
        }
    }

}
