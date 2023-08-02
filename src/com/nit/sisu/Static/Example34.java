package com.nit.sisu.Static;
class Example34 
{
	static int a=10;
	
	static
	{
		System.out.println("from SB");
		System.out.println("a:"+a);
		System.out.println("b:"+Example34.b);
		b=50;
	}

	public static void main(String[] args) 
	{
		System.out.println("from MM");
		System.out.println("a:"+a);
		System.out.println("b:"+b);

	}
	static int b=20;
	
	
}
