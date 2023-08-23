/*
 * Write a Java 8 program to concatenate two Streams?
 */


package com.nit.sisu.streamAPI;

import java.util.stream.Stream;

public class Question10 
{

	public static void main(String[] args) 
	{
		// Creating two Streams
        Stream<String> stream1 = Stream.of("Niranjana", "charty");
        Stream<String> stream2 = Stream.of("Sisu", "Charty");
        
        //concat two Stream
       Stream.concat(stream1, stream2).forEach(element -> System.out.print(element));
       
	}
}
