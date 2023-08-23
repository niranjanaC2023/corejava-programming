package com.nareshit.niranjana.datatype;

public class Datatype 
{
	static byte abc ;
	public static void main(String[] args) 
	{
		
		int x = 1000;
		System.out.println(x);
		
		//convert int to byte
		byte y = (byte)x;
		System.out.println(y);
		
		//find what is the output here
//		int i1 = 10 + 20.0f;  //error
		
		int i1 = 10 + (int)20.0f;
		System.out.println(i1);
		
		byte b1 = 10;
		byte b2 = 20;
//		byte b3 = b1 + b2; //error
		byte b3 = (byte)(b1 + b2);
		System.out.println(b3);
		
		//type promotion(convert smaller range to higher range)
		int i3 = 1000;
		long l = i3;
		System.out.println(l);
		
		//narrowing/casting(convert lower range to higher range)
		int i4 = 500;
		byte b = (byte)i4;
		System.out.println(b);
		
		
		
		
		
		
	}

}
