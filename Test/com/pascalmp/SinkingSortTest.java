package com.pascalmp;

import static org.junit.Assert.*;

import org.junit.Test;

public class SinkingSortTest {

	@Test
	public void shouldSortSortedArrayList() {
		checkIfSinkingSortedArrayReturnsExpected(new int[] {0, 1}, SinkingSort.sortArrayList(new int[] {0, 1}));
	}
	
	@Test
	public void shouldSortUnsortedArrayListOfLengthTwo() throws Exception{
		checkIfSinkingSortedArrayReturnsExpected(new int[] {0,  1}, SinkingSort.sortArrayList(new int[] {1, 0}));
	}
	
	@Test
	public void shouldSortPartiallySortedArrayListofLentgthThree() throws Exception{
		checkIfSinkingSortedArrayReturnsExpected(new int[] {0,  1, 2}, (new int[] {0, 2, 1}));
	}
	
	@Test
	public void shouldSortUnsortedArrayListOfLengthThree() throws Exception{
		checkIfSinkingSortedArrayReturnsExpected(new int[] {0,  1, 2}, (new int[] {2, 1, 0}));
	}

	
	//Extracted method and Introduced parameter, to reduce the duplications in the test code
	
	private void checkIfSinkingSortedArrayReturnsExpected(int[] expectedReturn, int[] inputArray) {
		assertArrayEquals(expectedReturn, SinkingSort.sortArrayList(inputArray));
	}

}
