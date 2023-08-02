package com.nit.sisu.Static;
class Example41
{
	
	static 
	{
		System.out.println("a:"+Example41.a);
		a=50;
		
		System.out.println("a:"+Example41.a);

	}
	static int a=m1();
	static int m1()
	{
		
		System.out.println("a:"+Example41.a);
		return 70;
	}
	static
	{
		
		System.out.println("a:"+Example41.a);
	}

	public static void main(String[] args) 
	{
		
		System.out.println("a:"+Example41.a);
	}	
}
