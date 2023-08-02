package com.nit.sisu.Methods;
class COVL4
{
	int x=m1();
	{
		
		System.out.println("NSB");
	}
	
	int m1()
	{
	
		System.out.println("m1:x");
		return 10;
	}
	
	COVL4()
	{
		this(10);
		x=50;
		System.out.println("No-arg constructor");
	}
	COVL4(int a)
	{
		this("abc");
		x=60;
		System.out.println("int-arg constructor");
	}
	COVL4(String str)
	{
		
		x=70;
		System.out.println("String-arg constructor");
	}


	public static void main(String[] args) 
	{
		COVL4 c1 =  new COVL4();
		System.out.println("c1.x:"+c1.x);

		COVL4 c2 =  new COVL4();
		System.out.println("c2.x:"+c2.x);

		COVL4 c3 =  new COVL4("abc");
		System.out.println("c3.x:"+c3.x);

	}
}
