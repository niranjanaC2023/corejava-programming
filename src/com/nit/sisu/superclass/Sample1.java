package com.nit.sisu.superclass;
class Example1
{
	Example1()
	{
		System.out.println("example zero-param");
	}
	Example1(int a)
	{
		System.out.println("example  int-param");
	}
}
class Sample1 extends Example1 
{
	Sample1()
	{
			System.out.println("sample zero-param");
	}
	Sample1(int a)
	{	
		System.out.println("sample int-param");
		
	}
	public static void main(String[] args) 
	{
		Sample1 s1 = new Sample1();
		Sample1 s2 = new Sample1();
	}
}
