package com.nit.sisu.Static;
class static10
{
	static int a=10;
	public static void main(String[]args)
	{
			int a=50;
			static10.a=a;
			System.out.println(a);
			System.out.println(static10.a);
	}
}
