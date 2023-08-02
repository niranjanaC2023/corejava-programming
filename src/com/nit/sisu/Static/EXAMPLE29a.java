package com.nit.sisu.Static;
class EXAMPLE
{
	static int a = 10;
	static
	{
		System.out.println("EX SB");
	}
	static void m1()
	{
		System.out.println("EX M1");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("EX main");	
	}
}
class EXAMPLE29a
	{
		static
		{
				System.out.println("EXAMPLE29a SB");
		}
		public static void main(String[] args) 
		{
			System.out.println("EXAMPLE29a main");
			EXAMPLE.m1();
		}
	}
		
	
	

