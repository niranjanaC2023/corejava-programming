package com.nit.sisu.non_static;
class Non_static53
{
	static int a=10;
	{
		System.out.println("a:"+a);
		System.out.println("b:"+getB());		
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
	static int getB()
	{
		return b;
	}
	static int b=20;
}
	




		


