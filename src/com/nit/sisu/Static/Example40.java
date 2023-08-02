package com.nit.sisu.Static;
class Example40
{
	static int a=m1();
	static int m1()
	{
		System.out.println("from m1 a :"+a);
		return 50;
	}
	static
	{
		System.out.println("from SB a:"+a);
	}
 
	public static void main(String[] args) 
	{
		System.out.println("from MM a:"+a);
	}	
}
