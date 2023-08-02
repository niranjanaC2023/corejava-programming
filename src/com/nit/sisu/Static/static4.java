package com.nit.sisu.Static;
class static4
{
	static int a=10;
	static int b =20;
	
	public static void main(String[]args)
	{
		System.out.println(a);
		System.out.println(b);
		int a=50;
		System.out.println(a);
		System.out.println(static4.a);
		System.out.println(a);
		System.out.println(static4.b);
	}
}
