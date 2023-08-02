package com.nit.sisu.Methods;
class Raju
{
	void m1()
	{
		System.out.println("A m1");
	}
	
	 void m2()
	{
		System.out.println("A m2");
	}
	
	void m3()
	{
		System.out.println("A m1");
	}
}
class Const_chaining2 extends Raju
{
	@Override
	void m1()
	{
		
		System.out.println("B m1");
	}
	 @Override
	void m2()
	{
		System.out.println("B m2");				// we can convert non-final method to final method
	}
	public static final void main(String[] args) 
	{
		Const_chaining2 c1 = new Const_chaining2();

		c1.m1();
		c1.m2();
		c1.m3();

	}
}
