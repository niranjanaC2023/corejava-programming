package com.nit.sisu.polymorphism;
class Example
{
	Example()
	{
		System.out.println("example zero-param");
	}
	Example(int a)
	{
		System.out.println("example  int-param");
	}
}
class Sample1 extends Example 
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
