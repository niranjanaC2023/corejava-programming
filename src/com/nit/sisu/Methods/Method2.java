package com.nit.sisu.Methods;
class Method2
{
	
	static void m1(int a)
	{
		System.out.println("m1");
	}
	static void m2()
	{
		System.out.println("m2");
	}
	public static void main(String[] args) 
	{
		m1(50);

		Method2 obj = new Method2();
		obj.m2();
	}
}
