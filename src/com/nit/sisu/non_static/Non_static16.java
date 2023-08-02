package com.nit.sisu.non_static;
class Non_static16
{
	int x=10;
	int y=20;
	
	void m1()
	{
		Non_static16 obj = new Non_static16();
		obj.x=50;
		obj.y=60;
		
		System.out.println(obj.x+"..."+obj.y);
		

	}
	public static void main(String[] args) 
	{
		Non_static16 obj1 = new Non_static16();
		System.out.println(obj1.x+"..."+obj1.y);
		obj1.m1();

		System.out.println(obj1.x+"..."+obj1.y);
		
		
	}
}
