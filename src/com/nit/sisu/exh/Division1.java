package com.nit.sisu.exh;
class Division1
{
	public static void main(String[] args) 
	{
		try{
		int a=Integer.parseInt("12");
		int b=Integer.parseInt("3");
		int c=a/b;
		System.out.println(c);
		}
		catch(ArrayIndexOutOfBoundsException aiob)
		{
			System.out.println("please pass atleast two integer values");
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("please pass only integer values");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("please donot pass second value as ZERO");
		}
	}
}
