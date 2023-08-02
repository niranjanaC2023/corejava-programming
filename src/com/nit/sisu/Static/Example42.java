package com.nit.sisu.Static;
class Example42
{
	
	static 
	{
		System.out.println("a:"+Example42.a);
		int a=50;
		
		System.out.println("a:"+Example42.a);

	}
	static int a=m1();
	static int m1()
	{
		
		System.out.println("a:"+Example42.a);
		return 70;
	}
	static
	{
		
		System.out.println("a:"+Example42.a);
	}

	public static void main(String[] args) 
	{
		
		System.out.println("a:"+Example42.a);
	}	
}
