package com.nit.sisu.Static;
class Example33 
{
	static int a=10;
	static int b=20;
	static
	{
		System.out.println("from SB");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}

	public static void main(String[] args) 
	{
		System.out.println("from MM");
		System.out.println("a:"+a);
		System.out.println("b:"+b);

	}
	
	
}
