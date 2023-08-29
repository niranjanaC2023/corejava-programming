/*
 * Write a Program to find the numbers greater than 5 in an array?
 */


package com.nit.sisu.streamAPI;

public class Question16 
{

	public static void main(String[] args) 
	{
		int[] numbers = { 5, 2, 8, 1, 7 };
		System.out.println("numbers greater than 5:");
		
		//using for-loop
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] > 5) 
            {
                System.out.println(numbers[i]);
            }
        }
        
        //using enhanced for-loop
        System.out.println("numbers greater than 5:");
        for (int number : numbers) 
        {
            if (number > 5) 
            {
                System.out.println(number);
            }
        }
	}
}
