package com.nit.sisu.non_static;
class Non_static49
{
	static int a=10;
	static
	{
		System.out.println("a:"+a);
		//System.out.println("b:"+b);		//ilegal forward
	}
	
	
	public static void main(String[] args)
	{
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
	static int b=20;
}
	




		


