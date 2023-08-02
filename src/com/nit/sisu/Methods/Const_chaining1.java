package com.nit.sisu.Methods;
class Raj
{
	void m1()
	{
		System.out.println("A m1");
	}
	
	final void m2()
	{
		System.out.println("A m2");
	}
	
	void m3()
	{
		System.out.println("A m1");
	}
}
class Const_chaining1 extends Raj
{
	@Override
	void m1()
	{
		
		System.out.println("B m1");
	}
	 /* void m2()								// final method can not override
	{
		System.out.println("B m2");				// final method can not override
	}*/
	public static void main(String[] args) 
	{
		Const_chaining1 c1 = new Const_chaining1();

		c1.m1();
		c1.m2();
		c1.m3();

	}
}
