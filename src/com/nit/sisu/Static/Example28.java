package com.nit.sisu.Static;
class Example28
{
	static int a = m1();
	static int m1()
	{
		System.out.println("SV:a");
		return 10;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main");
		m1();
			
	}
}
