package com.nit.sisu.Methods;
class COVL3
{
	COVL3()
	{
		this(10);
		System.out.println("Ex No-arg constructor");
	}
	
	COVL3(int a)
	{
		this("abc");
		System.out.println("Ex int-arg constructor");
	}
	
	COVL3(String str)
	{
		System.out.println("Ex String-arg constructor");
	}


	public static void main(String[] args) 
	{
		COVL3 c1 =  new COVL3();
	
		COVL3 c2 =  new COVL3("abc");

	}
}
