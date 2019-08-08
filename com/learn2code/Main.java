package com.learn2code;

import java.util.Random;

public class Main {
    public static void main (String[] args) {
        Random random = new Random();

        int[] intArray = new int[7];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(5000);
        }
        
        // pls only use one method at a time


        //Sort.bubbleSort(intArray);
        //Sort.selectionSort(intArray);
        //Sort.insertionSort(intArray);
        Sort.shellSort(intArray);
        
    }

}
