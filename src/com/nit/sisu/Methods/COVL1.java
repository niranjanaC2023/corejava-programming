package com.nit.sisu.Methods;
class COVL1 
{
	COVL1()
	{
		System.out.println("Ex No-arg constructor");
	}
	
	COVL1(int a)
	{
		System.out.println("Ex int-arg constructor");
	}
	
	COVL1(String str)
	{
		System.out.println("Ex String-arg constructor");
	}

	public static void main(String[] args) 
	{
		COVL1 c1 =  new COVL1();
		COVL1 c2 =  new COVL1(10);
		COVL1 c3 =  new COVL1("abc");

	}
}
