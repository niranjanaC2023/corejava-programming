package com.nit.sisu.non_static;
class Non_static13 
{
	int x=10;
	int y=20;
	void printXY()
	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) 
	{
		Non_static13 obj1 = new Non_static13();
		Non_static13 obj2 = new Non_static13();

		obj1.printXY();
		obj2.printXY();
		
	}
}
