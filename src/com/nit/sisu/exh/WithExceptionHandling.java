package com.nit.sisu.exh;
class Example4
{
	
		 void m1()
		{
			System.out.println("1");
			try{
				System.out.println("2");
				int x=10/0;
				System.out.println("3");
				}
			catch(ArithmeticException ae)
			{
			System.out.println("4");
			}
			System.out.println("5");
		}
}
class WithExceptionHandling
{
	public static void main(String[] args) 
	{
		Example4 e1 = new Example4();
		e1.m1();
	}
}
