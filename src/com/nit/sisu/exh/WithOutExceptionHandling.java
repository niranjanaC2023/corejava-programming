package com.nit.sisu.exh;
class Example5
{
	
		 void m1()
		{
			System.out.println("1");
			try{
				System.out.println("2");
				int x=10/0;
				System.out.println("3");
				}
			catch(ArrayIndexOutOfBoundsException ae)
			{
			System.out.println("4");
			}
			System.out.println("5");
		}
}
class WithOutExceptionHandling
{
	public static void main(String[] args) 
	{
		Example5 e1 = new Example5();
		e1.m1();
	}
}
