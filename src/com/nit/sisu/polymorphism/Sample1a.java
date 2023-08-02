package com.nit.sisu.polymorphism;
class Dude
{
	Dude()
	{
		System.out.println("example zero-param");
	}
	Dude(int a)
	{
		System.out.println("example  int-param");
	}
}
class Sample1a extends Dude 
{
	Sample1a()
	{
			System.out.println("sample zero-param");
	}
	Sample1a(int a)
	{	
		
		System.out.println("sample int-param");
		
	}
	public static void main(String[] args) 
	{
		Sample1a s1 = new Sample1a();
		Sample1a s2 = new Sample1a(10);
	}
}
