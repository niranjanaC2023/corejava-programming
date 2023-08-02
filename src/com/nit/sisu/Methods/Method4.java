package com.nit.sisu.Methods;
class Method4
{
	
	static void m1()
	{
		System.out.println("m1");
	}

	static void m2(int a)
	{
		System.out.println("m2");
	}
	public static void main(String[] args) 
	{
		m1();
		//m1(50);

		//m2();
		m2(20);
		m2('a');

		//m1(50,34);
		//m1(true);
	}
}
