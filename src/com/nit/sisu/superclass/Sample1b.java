package com.nit.sisu.superclass;
class Example1b
{
	Example1b()
	{
		System.out.println("example zero-param");
	}
	Example1b(int a)
	{
		System.out.println("example  int-param");
	}
}
class Sample1b extends Example1b 
{
	Sample1b()
	{
			System.out.println("sample zero-param");
	}
	Sample1b(int a)
	{	
		super(5);
		System.out.println("sample int-param");
		
	}
	public static void main(String[] args) 
	{
		Sample1b s1 = new Sample1b();
		Sample1b s2 = new Sample1b();
	}
}
