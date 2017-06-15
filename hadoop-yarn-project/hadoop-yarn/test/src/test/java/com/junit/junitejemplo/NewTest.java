package com.junit.junitejemplo;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;


public class NewTest {
	
	//compare the array of numbers
	@Test
	public void test0() {
		int[] num = {5, 1, 2, 11};
		int[] numa = {1, 2, 5, 11};
		Arrays.sort(num);
		assertArrayEquals(numa,num);

	}
	//test the performance
	@Test(timeout=100)
	public void test1() {
		int array[]={11, 20, 5};
		for (int i=1; i<= 1000 ;i++){
			array[0]=1;
			Arrays.sort(array);
		}
	}
	
	
}
