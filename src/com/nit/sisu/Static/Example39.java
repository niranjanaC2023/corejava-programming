package com.nit.sisu.Static;
class Example39
{
	static int a=10;
	
	static
	{
		System.out.println("from SB");
		System.out.println("a:"+a);
		//System.out.println("b:"+b);
		m1();
	}
	static void m1()
	{
		System.out.println("from SM");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}

	public static void main(String[] args) 
	{
		System.out.println("from MM");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		m1();

	}
	static int b=20;
	
	
}
