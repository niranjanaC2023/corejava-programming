package com.nareshit.niranjana.datatype;

public class CheckDatatype 
{

	public static boolean isByte(byte b)
	{
		return true;
	}
	public static boolean isDouble(double b)
	{
		return true;
	}
	public static boolean isChar(char b)
	{
		return true;
	}
	public static boolean isBoolean(boolean b)
	{
		return true;
	}
	
	public static void main(String[] args) 
	{
		
		int x  = 500;
		byte abc=(byte)x;
		System.out.println(abc);
		
		double doubleValue = 3.14;
        char charValue = 'A';
        boolean booleanValue = true;
		
		if(isByte(abc)) 
		{
		
			System.out.println("Byte datatype");
		}
		else if(isDouble(doubleValue)) 
		{
		
			System.out.println("Double datatype");
		}
		else if(isChar(charValue)) 
		{
		
			System.out.println("Char datatype");
		}
		else if(isBoolean(booleanValue)) 
		{
		
			System.out.println("Boolean datatype");
		}
		else
		{
			System.out.println("Unknown datatype");
		}	
	}
}
