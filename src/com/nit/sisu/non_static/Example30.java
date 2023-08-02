package com.nit.sisu.non_static;
class Example30
{
	static Example30 e1=new Example30();
	static
	{
		System.out.println("SB start");
		Example30 e2=new Example30();
		System.out.println("SB end");
	}
	Example30()
	{
		System.out.println("NPC start");
		Example30 e3=new Example30(5);
		System.out.println("NPC end");
	}
	Example30(int x)
	{
		System.out.println("IPC executed");
	}
	static int a=m1();
	static int m1()
	{
		System.out.println("SV a is initialized");
		return 10;
		
	}
	int x= m2();
	int m2()
	{
		System.out.println("NSV x is initialized");
		return 30;
	}
	static
	{
		System.out.println("SB2 is executed");
	}
	{
		System.out.println("NSB is executed");
	}	
	public static void main(String[] args) 
	{
		System.out.println("main start");
		Example30 e4=new Example30();
		m3();
		e4.m4();
		System.out.println("main end");

	}
	static void m3()
	{
		System.out.println("m3 start");
		Example30 e5=new Example30();
		System.out.println("m3 end");
	}
	void m4()
	{
		System.out.println("m4 start");
		Example30 e6=new Example30();
		System.out.println("m4 end");
	}
	static void m5()
	{
		
		System.out.println("m5 start");
		Example30 e7=new Example30();
		System.out.println("m5 end");
	}
	static int b=20;
	int y=30;
	static
	{
		System.out.println("SB3 executed");
	}
	{
		System.out.println("NSB2 executed");
	}
	static Example30 e8 = new Example30(5);
}




