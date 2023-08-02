package com.nit.sisu.Static;
class Sm_Execution1
{
	static int a=10;
	static int b=20;
	static 
	{
		System.out.println("SB");
	}
	public static void main(String[] args) 
	{
		System.out.println("MM");
	}
	static void m1()
	{
		System.out.println("SM");
	}
}
