package com.nit.sisu.Static;
class static7
{
	static int a=m1();
	static int m1()
	{
		System.out.println("variable a is created");
		return 10;
	}
	static int m2()
	{
		System.out.println("variable b is created");
		return 20;
	}
	public static void main(String[]args)
	{
		System.out.println("main");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
	}
	static int b=m2();
	static int m3()
	{
		System.out.println("variable c is created");
		return 30;
	}
	
	static int c=m3();
}
