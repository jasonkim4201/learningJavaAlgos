package com.learn2code;

public final class Sort {

    public static void bubbleSort(int[] array) {

        System.out.println("Unsorted array:");
        printArray(array);

        // where the actual algorithm is

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }

        }

        System.out.println("\nSorted array:");
        printArray(array);
    }

    public static void selectionSort(int[] array) {
        System.out.println("Unsorted array:");
        printArray(array);

        // where the actual algorithm is
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;

            for (int i = 0; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largest]) {
                    largest = i;
                }
            }

            swap(array, largest, lastUnsortedIndex);
        }
        
       System.out.println("\nSorted array:");
       printArray(array);
    }

    public static void insertionSort(int[] array) {

        System.out.println("Unsorted array:");
        printArray(array);

        // actual stuff here

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {

            int newElement = array[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }

            array[i] = newElement;

        }

        System.out.println("\nSorted array:");
        printArray(array);

    }

    // this is a variation of shell sort
    public static void shellSort(int[] array) {

        System.out.println("Unsorted array:");
        printArray(array);

        // actual code2learn
        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];
                int j = i;

                while (j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j -= gap;
                }

                array[j] = newElement;
            }

        }

        // printing out values
        System.out.println("\nSorted array:");
        printArray(array);

    }
    
  
    // my swap method
    private static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
    
    
    // made this because I got tried of typing this out a bunch of times
    private static void printArray(int[] array) {
    	for (int number : array) {
    		System.out.print(number + " ");
    	}
    }
    
    
}
