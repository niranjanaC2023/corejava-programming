package com.nit.sisu.non_static;
class Example
{
	static int a=10;
	static int b=20;

	int x=30;
	int y=40;
	static void m1()
	{
		System.out.println("m1");
	}
	void m2()
	{
		System.out.println("NSB start");
		System.out.println("NSB end");
	}
}
class Non_static68
{

	public static void main(String[] args)
	{
		System.out.println("main start");
		//System.out.println("a:"+a);		//error
		System.out.println("a:"+Example.a);
		
		Example obj1 = null;
		System.out.println("b:"+obj1.b);

		Example obj2 = new Example();
		System.out.println("b:"+obj2.b);
		Example.m1();

		//System.out.println(Example.x);		//error
		System.out.println(obj1.x);
		System.out.println(obj2.x);
		System.out.println(obj2.y);
		obj2.m2();


		
	}
	
	
}



		


