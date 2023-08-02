package com.nit.sisu.non_static;
class Non_static14 
{
	int x=10;
	int y=20;
	void setXY()
	{
		x=50;
		y=60;
	}
	void printXY()
	{
		System.out.println(x);
		System.out.println(y);
	}
	void m1()
	{
		setXY();
		printXY();
	}
	public static void main(String[] args) 
	{
		Non_static14 obj1 = new Non_static14();
		obj1.m1();

		
		
	}
}
