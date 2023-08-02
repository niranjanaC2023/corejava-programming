package com.nit.sisu.polymorphism;
class Win
{
	Win()
	{
		System.out.println("example zero-param");
	}
	Win(int a)
	{
		System.out.println("example  int-param");
	}
}
class Sample1b extends Win 
{
	Sample1b()
	{
			System.out.println("sample zero-param");
	}
	Sample1b(int a)
	{	
		super(5);
		System.out.println("sample int-param");
		
	}
	public static void main(String[] args) 
	{
		Sample1b s1 = new Sample1b();
		Sample1b s2 = new Sample1b();
	}
}
