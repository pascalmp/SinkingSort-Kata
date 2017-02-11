package com.pascalmp;

public class SinkingSort {

	public static int[] sortArrayList(int[] array) {

		boolean swapped = true;
		while(swapped)
			for(int j = 1; j < array.length; j++){
				swapped = false;
				if(array[j - 1] > array[j]){
					int thatNum = array[j];
					array[j] = array[j - 1];
					array[j - 1] = thatNum;
					swapped = true;
				}
			}
		return array;
	}

}
