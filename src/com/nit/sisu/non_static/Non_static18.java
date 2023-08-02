package com.nit.sisu.non_static;
class Non_static18
{
	int x=10;
	int y=20;
	
	void m2(Non_static18 obj)
	{
	}
	
	public static void main(String[] args) 
	{
		Non_static18 obj1 = new Non_static18();
		Non_static18 obj2 = new Non_static18();
		                                                                                                                                             
		obj1.m2(obj2);
	}
}
		


