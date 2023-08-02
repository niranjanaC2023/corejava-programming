package com.nit.sisu.superclass;
class Example2
{
	Example2()
	{
		System.out.println("example zero-param");
	}
	Example2(int a)
	{
		System.out.println("example int-param");
	}
}
class Sample2 extends Example2
{
	Sample2(int a)
	{	
		System.out.println("sample int-param");
	}
	public static void main(String[] args) 
	{
		Sample2 s1 = new Sample2(10);
	}
}
