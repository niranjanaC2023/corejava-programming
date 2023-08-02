package com.nit.sisu.superclass;
class Example1c
{
	Example1c()
	{
		System.out.println("example zero-param");
	}
	Example1c(int a)
	{
		System.out.println("example  int-param");
	}
}
class Sample1c extends Example1c 
{
	Sample1c()
	{
			System.out.println("sample zero-param");
	}
	Sample1c(int a)
	{	
		super(50);
		System.out.println("sample int-param");
		
	}
	public static void main(String[] args) 
	{
		Sample1c s1 = new Sample1c();
		Sample1c s2 = new Sample1c(10);
	}
}
