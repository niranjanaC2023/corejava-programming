/*
 Give Example of 
 */

package com.nit.sisu.streamAPI;

import java.util.stream.IntStream;

public class SkipAndLimitMethod 
{
	public static void main(String[] args) 
	{
		
		IntStream.rangeClosed(10, 28).skip(5).limit(8).forEach(System.out::println);
		
		//here skip() takes first 4 elements to skip
		//limit() takes number of elements to show in output
		
	}

}
