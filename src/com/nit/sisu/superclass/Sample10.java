//variable hiding
package com.nit.sisu.superclass;
class Example10
{
	int x=10;
	int y=20;

	void m1()
	{
		System.out.println("m1");
	}
}
class Sample10 extends Example10
{
	int x=30;
	int y=40;
	void m2()
	{
		System.out.println("x:"+x);
		System.out.println("y:"+y);


		System.out.println("x:"+super.x);
		System.out.println("y:"+super.y);

	}
	void m3()
	{
		int x=50;
		int y=60;
		System.out.println("local x:"+x);
		System.out.println("local y:"+y);


		System.out.println("subclass x:"+this.x);
		System.out.println("subclass y:"+this.y);



		System.out.println("super x:"+super.x);
		System.out.println("super y:"+super.y);

	}
	public static void main(String[] args) 
	{
		Sample10 s1 = new Sample10();
		s1.m2();
		s1.m3();
	}
};
