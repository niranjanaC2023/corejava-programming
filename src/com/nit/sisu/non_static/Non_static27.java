package com.nit.sisu.non_static;
class Non_static27
{
	int x=10;
	int y=20;
	void m1()
	{
		System.out.println(x);
		System.out.println(y);
		int x=50;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(y);

	}
	public static void main(String[] args) 
	{
		Non_static27 obj1 = new Non_static27();
		obj1.m1();
	}
}




		


