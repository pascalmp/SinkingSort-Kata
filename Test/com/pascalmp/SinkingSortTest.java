package com.pascalmp;

import static org.junit.Assert.*;

import org.junit.Test;

public class SinkingSortTest {

	@Test
	public void shouldSortSortedArrayList() {
		assertArrayEquals(new int[] {0, 1}, SinkingSort.sortArrayList(new int[] {0, 1}));
	}
	
	@Test
	public void shouldSortUnsortedArrayListOfLengthTwo(){
		assertArrayEquals(new int[] {0,  1}, SinkingSort.sortArrayList(new int[] {1, 0}));
	}
	
	@Test
	public void shouldSortPartiallySortedArrayListofLentgthThree(){
		assertArrayEquals(new int[] {0,  1, 2}, SinkingSort.sortArrayList(new int[] {0, 2, 1}));
	}

}
