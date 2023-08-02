package com.nit.sisu.Static;
class static14
{
	static int a;
	static void m1(int a)
	{
			a=static14.a;
			System.out.println(a);
	}
	public static void main(String[]args)
	{
			System.out.println(a);
			m1(50);
			System.out.println(a);
	}
}
