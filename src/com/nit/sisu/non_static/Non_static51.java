package com.nit.sisu.non_static;
class Non_static51
{
	static int a=10;
	{
		System.out.println("a:"+a);
		System.out.println("b:"+Non_static51.b);		
	}
	
	
	public static void main(String[] args)
	{
		Non_static51 obj = new Non_static51();
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
	static int b=20;
}
	




		


