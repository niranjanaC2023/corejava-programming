package com.nit.sisu.Static;
class static1
{
	static int a=10;
	static int b = 20;
	public static void main(String[]args)
	{
		System.out.println("value of A: "+a);
		System.out.println("value of B: "+b);
		m1();
	}
	public static void m1()
	{
		System.out.println("m1() A: "+a);
		System.out.println("m1() B: "+b);
	
	}
}
