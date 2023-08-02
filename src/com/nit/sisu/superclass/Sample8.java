package com.nit.sisu.superclass;
class Example8
{
	
	static int a=10;
	int x=20;
	 static void m1()
	{
		 System.out.println("A class m1");
	}
	void m2()
	{
		System.out.println("A class m2");
	}
	void m3()
	{
		System.out.println("A class m3");
	}
}
class Sample8 extends Example8
{
	static int a=50;
	int x=60; 

	static void m1()
	{
		 System.out.println("B class m1");
	}
	void m2()
	{
		System.out.println("B class m2");
	}

	public static void main(String[] args)
	{
		System.out.println("a:"+a);
		m1();

		Sample8 s1 = new Sample8();
		System.out.println("x:"+s1.x);
		s1.m2();
		s1.m3();
	}

}
