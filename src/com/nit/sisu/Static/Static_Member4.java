package com.nit.sisu.Static;
class Static_Member4
{
	static int a = 10;
	static
	{
			System.out.println("EX SB1");
	}
	
	static int b = 20;
	static
	{
			System.out.println("EX SB2");
	}
	
	public static void main(String[]args)
	{
			System.out.println("MM");
	}
	static
	{
			System.out.println("EX SB3");
	}
	static int c = 30;
	}
class Sample
{
	static int d = 50;
	static
	{
			System.out.println("sa SB2");
			System.out.println("Static_Member4.b");
	}
}



