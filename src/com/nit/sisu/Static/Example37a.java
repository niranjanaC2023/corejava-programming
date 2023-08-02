package com.nit.sisu.Static;
class Example37a
{
	static int a=10;
	
	static
	{
		System.out.println("from SB");
		System.out.println("a:"+a);
		//System.out.println("b:"+b);
		System.out.println("b:"+Example37a.b);
		a=50;
		b=60;
		System.out.println("a:"+a);
		//System.out.println("b:"+b);
		System.out.println("b:"+Example37a.b);
	}

	public static void main(String[] args) 
	{
		System.out.println("from MM");
		System.out.println("a:"+a);
		System.out.println("b:"+b);

	}
	static int b;
	
	
}
