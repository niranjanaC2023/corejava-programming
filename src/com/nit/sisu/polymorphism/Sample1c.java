package com.nit.sisu.polymorphism;
class Plugin
{
	Plugin()
	{
		System.out.println("example zero-param");
	}
	Plugin(int a)
	{
		System.out.println("example  int-param");
	}
}
class Sample1c extends Plugin 
{
	Sample1c()
	{
			System.out.println("sample zero-param");
	}
	Sample1c(int a)
	{	
		super(50);
		System.out.println("sample int-param");
		
	}
	public static void main(String[] args) 
	{
		Sample1c s1 = new Sample1c();
		Sample1c s2 = new Sample1c(10);
	}
}
