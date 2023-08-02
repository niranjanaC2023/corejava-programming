package com.nit.sisu.non_static;
class Non_static1 
{
	int x=10;
	int y=20;
	public static void main(String[] args) 
	{
		System.out.println("main");
		Non_static1 e = new Non_static1();
		System.out.println(e);
	}
}
