package com.nit.sisu.superclass;
class Example1a
{
	Example1a()
	{
		System.out.println("example zero-param");
	}
	Example1a(int a)
	{
		System.out.println("example  int-param");
	}
}
class Sample1a extends Example1a 
{
	Sample1a()
	{
			System.out.println("sample zero-param");
	}
	Sample1a(int a)
	{	
		
		System.out.println("sample int-param");
		
	}
	public static void main(String[] args) 
	{
		Sample1a s1 = new Sample1a();
		Sample1a s2 = new Sample1a(10);
	}
}
