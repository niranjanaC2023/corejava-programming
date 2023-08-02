package com.nit.sisu.Methods;
class Example
{
	Example()
	{
		System.out.println("Ex No-arg constructor");
	}
	
	Example(int a)
	{
		System.out.println("Ex int-arg constructor");
	}
	
	Example(String str)
	{
		System.out.println("Ex String-arg constructor");
	}
}
class COVL2 extends Example
{
	COVL2()
	{
		System.out.println("sa no-arg constructor");
	}
	COVL2(String str)
	{
		super(10);
		System.out.println("sa string-arg constructor");
	}

	public static void main(String[] args) 
	{
		COVL2 c1 =  new COVL2();
	
		COVL2 c2 =  new COVL2("abc");

	}
}
