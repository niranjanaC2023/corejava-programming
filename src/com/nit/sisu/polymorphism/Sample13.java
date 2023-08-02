package com.nit.sisu.polymorphism;
class Jsty
{
	int x=10;
	int y=20;

	void m1()
	{
		System.out.println(x);
		System.out.println(y);
	}
}
class Sample13 extends Jsty
{
	int x=30;
	int y=40;
	void m2()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) 
	{
		Sample13 s1 = new Sample13();
		Sample13 s2 = new Sample13();

		s2.x=50;
		s2.y=60;

		s1.m1();
		s1.m2();

		s2.m1();
		s2.m2();


	}
}
