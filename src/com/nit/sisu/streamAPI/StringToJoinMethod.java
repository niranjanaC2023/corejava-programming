/*
 Give Example of String.join() method
 */

package com.nit.sisu.streamAPI;

import java.util.Arrays;
import java.util.List;

public class StringToJoinMethod 
{
	public static void main(String[] args) 
	{
		List<String> numbers= Arrays.asList("10","21","07","32");
		String result = String.join("-",numbers);
		System.out.println(result);
		
		String result2 = String.join(",",numbers);
		System.out.println(result2);
		
		
	}

}
