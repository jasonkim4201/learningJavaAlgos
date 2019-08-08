package com.mergesort;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] intArray = new int[13];
		Random random = new Random();
		
		for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(10000);
        }
		
		System.out.println("Unsorted:");
		printArray(intArray);
		
		Sort.mergeSort(intArray, 0, intArray.length);
		
		System.out.println("\nSorted:");
		printArray(intArray);
		
	}
	
	
	
	
	
	private static void printArray(int[] array) {
		for (int number : array) {
			System.out.print(number + " ");
		}
	}
	
}
