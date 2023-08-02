package com.nit.sisu.non_static;
class Non_static19
{
	int x=10;
	int y=20;
	
	void m1(Non_static19 obj)
	{
		System.out.println("passed object original value");
		System.out.println(x+"....."+y);
		System.out.println();
		x=5;
		y=6;

		System.out.println("object value after modification");;
		System.out.println(x+"....."+y);
		System.out.println();
	}

	
	public static void main(String[] args) 
	{
		Non_static19 obj1 = new Non_static19();
		Non_static19 obj2 = new Non_static19();

		System.out.println("obj1 object value before calling m1() method");
		System.out.println(obj1.x+"....."+obj1.y);
		System.out.println();
		                                                                                                                                             
		obj1.m1(obj2);

		System.out.println("obj1 object value after calling m1() method");
		System.out.println(obj1.x+"....."+obj1.y);
		System.out.println();

		System.out.println("obj2 object value after calling m1() method");
		System.out.println(obj2.x+"....."+obj2.y);		//no error


	}
}
		


