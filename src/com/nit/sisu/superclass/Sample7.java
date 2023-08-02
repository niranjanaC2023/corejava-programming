package com.nit.sisu.superclass;
class A2
{
	int x=10;
	int y=20;
}
class B2 extends A2
{
	int p=30;
	int q=40;
}
class Sample7
{

	public static void main(String[] args) 
	{
		B2 b1 = new B2();
		System.out.println(b1.x);
		System.out.println(b1.y);
		System.out.println(b1.p);
		System.out.println(b1.q);
	}
}
