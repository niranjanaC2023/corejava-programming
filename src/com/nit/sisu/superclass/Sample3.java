package com.nit.sisu.superclass;

class Example3
{
	Example3(int a)
	{
		System.out.println("example int-param");
	}
}
class Sample3 extends Example3
{
	Sample3(int a)
	{	
		super(5);		//with_out this super(5) its will be error because no default consructor in super class
		System.out.println("sample int-param");
	}
	public static void main(String[] args) 
	{
		Sample3 s1 = new Sample3(10);
	}
}
