package com.nit.sisu.Static;
class Example44
{
	
	static 
	{
		
		//System.out.println(a);
		System.out.println("a:"+Example44.a);
		 a=50;
		
		//System.out.println("a:"+a);
		System.out.println("a:"+Example44.a);

	}
	static int a=m1();
	static int m1()
	{
		
		System.out.println("a:"+a);
		return 70;
	}
	static
	{
		
		System.out.println("a:"+a);
	}

	public static void main(String[] args) 
	{
		
		System.out.println("a:"+a);
	}	
}
