//Non_Static execution flow
package com.nit.sisu.polymorphism;
class A
{
	void m1()
	{
		System.out.println("A m1");
	}
	void m2()
	{
		System.out.println("A m2");
		m1();
	}
}
class B extends A
{
	@Override
	void m1()
	{
		System.out.println("B m1");
	}
	void m3()
	{
		System.out.println("B m3");
		m1();
		super.m2();
	}
}
class C extends B
{
	@Override
	void m2()
	{
		System.out.println("C m2");
		//m4();	//m4() not avavilable in parent class
	}
}
class D_Sample10 extends C
{
	@Override
	void m1()
	{
		System.out.println("D m1");
	}
	@Override
	void m2()
	{
		System.out.println("D m2");
	}
	void m4()
	{
		System.out.println("D m4");
	}

	public static void main(String[]args)
	{
		D_Sample10 d1 = new D_Sample10();
		d1.m1();
		d1.m2();
		d1.m3();
		d1.m4();
	}
}
