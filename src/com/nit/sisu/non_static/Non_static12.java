package com.nit.sisu.non_static;
class Non_static12
{
	int x=10;
	int y=20;
	void m1()
	{
		System.out.println("m1");
	}
	void printXY()
	{
		System.out.println(x);
		System.out.println(y);
		m1();
	}
	public static void main(String[] args) 
	{
		Non_static12 obj = new Non_static12();
		obj.printXY(); 
	}
}
