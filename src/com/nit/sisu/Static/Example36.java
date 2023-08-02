package com.nit.sisu.Static;
class Example36 
{
	static int a=10;
	
	static
	{
		System.out.println("from SB");
		System.out.println("a:"+a);
		System.out.println("b:"+Example36.b);
		b=50;
		System.out.println("b:"+Example36.b);
	}

	public static void main(String[] args) 
	{
		System.out.println("from MM");
		System.out.println("a:"+a);
		System.out.println("b:"+b);

	}
	static int b=20;
	
	
}
