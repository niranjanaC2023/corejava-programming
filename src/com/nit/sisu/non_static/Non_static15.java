package com.nit.sisu.non_static;
class Non_static15
{
	int x=10;
	int y=20;
	void setXY()
	{
		this.x=50;
		this.y=60;
	}
	void printXY()
	{
		System.out.println(this.x);
		System.out.println(this.y);
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
