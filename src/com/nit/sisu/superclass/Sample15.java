package com.nit.sisu.superclass;
class A6
{
	static int a=10;
	int x=20;

	static
	{
		System.out.println("A is loaded");
	}
		
}
class B6 extends A6
{
	static int b=30;
	int y=40;
	static
	{
		System.out.println("B is loaded");
	}
}
class C extends A6
{
	static int c=50;
	int z=60;
	static
	{
		System.out.println("C is loaded");
	}
}
class Sample15
{
	static
	{
		System.out.println("Sample15 is loaded");		//static block first executed
	}
	public static void main(String[] args) 
	{
		B6 b1 = new B6();
		C c1 = new C();

		b1.a=15;
		b1.x=16;
		System.out.println("b1.a:"+b1.a);
		System.out.println("c1.a:"+c1.a);

		System.out.println("b1.x:"+b1.x);
		System.out.println("c1.x:"+c1.x);


	}
}
