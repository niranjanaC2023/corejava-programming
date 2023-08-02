package com.nit.sisu.non_static;
class Non_static20
{
	int x=10;
	int y=20;
	
	void m1(Non_static20 obj)
	{
		System.out.println("passed object original value");
		System.out.println(obj.x+"....."+obj.y);
		obj.x=5;
		obj.y=6;

		System.out.println("object value after modification");;
		System.out.println(obj.x+"....."+obj.y);
	}

	
	public static void main(String[] args) 
	{
		Non_static20 obj1 = new Non_static20();
		Non_static20 obj2 = new Non_static20();

		System.out.println("obj2 object value before calling m1() method");
		System.out.println(obj2.x+"....."+obj2.y);
		                                                                                                                                             
		obj2.m1(obj2);

		System.out.println("obj2 object value after calling m1() method");
		System.out.println(obj2.x+"....."+obj2.y);


	}
}
		


