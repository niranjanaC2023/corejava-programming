package com.nit.sisu.non_static;
class Non_static22
{
	void m1(int p)
	{
		p=60;
	}

	
	public static void main(String[] args) 
	{
		Non_static22 obj1 = new Non_static22();
		
		int x=50;
		obj1.m1(x);
		System.out.println(x);

	}
}
		


