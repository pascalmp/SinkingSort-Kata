package com.pascalmp;

public class SinkingSort {

	public static int[] sortArrayList(int[] array) {
		
		if(array[0] > array[1]){
			int thatNum = array[1];
			array[1] = array[0];
			array[0] = thatNum;
		}
		return array;
	}

}
