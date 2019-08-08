package com.mergesort;

public final class Sort {

		static void mergeSort(int[] input, int start, int end ) {
			 // ends recursion
			if (end - start < 2) {
				return;
			}
			
			int mid = (start + end) / 2;
			
			mergeSort(input, start, mid);
			mergeSort(input, mid, end);
			merge(input, start, mid, end);
		}
	
		static void merge(int[] input, int start, int mid, int end) {
			// optimization if everything in left array is smaller than everything in right array, do nothing
			if (input[mid - 1] <= input[mid]) {
				return;
			}
			
			int i = start; 
			int j = mid;
			int tempIndex = 0;
			
			int[] temp = new int[end - start];
			
			while (i < mid && j < end) {
				temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
			}
			// {32 , 34} , {33 , 36}
			// {32, 33, 34, 36}
			
			
			System.arraycopy(input, i, input, start + tempIndex, mid - i);
			System.arraycopy(temp, 0, input, start, tempIndex);
			
			
		}
	
	
	
}
