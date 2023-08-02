package com.nit.sisu.superclass;
class Example9
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
class Sample9 extends Example9
{
	static int a=50;
	int x=60; 

	static void m1()
	{
		 //super.m1();		//it's error because super class m1() is static so can't called.
		 System.out.println("B class m1");
	}
	void m2()
	{
		System.out.println("B class m2");
		super.m2();
	}
	void m4()
	{
		System.out.println(super.a+"............."+a);
		System.out.println(super.x+"............."+x);
		super.m1();
		m1();
		super.m2();
		m2();
	}

		public static void main(String[] args)
		{
			Sample9 s1 = new Sample9();
			s1.m4();
		}
	

}
