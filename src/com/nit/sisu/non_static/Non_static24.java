package com.nit.sisu.non_static;
class Non_static24
{
	int x=10;
	int y=20;
	void m1(int p)
	{
		System.out.println("passed value:"+p);
		p=50;
		System.out.println("modified value:"+p);	

	}

	void m2(Non_static24 obj)
	{
		System.out.println("passed object original values");
		System.out.println(obj.x+"....."+obj.y);
		obj.x=5;
		obj.y=6;
		System.out.println("object value after modified");	
		System.out.println(obj.x+"....."+obj.y);

	}

	
	public static void main(String[] args) 
	{
		Non_static24 obj1 = new Non_static24();
		int q=20;
		System.out.println("q value before calling m1() method:"+q);
		obj1.m1(q);
		System.out.println("q value before calling m1() method:"+q);


		Non_static24 obj2 = new Non_static24();
		System.out.println("obj2 object  value before calling m2() method:");
		System.out.println(obj2.x+"....."+obj2.y);
	
		obj1.m2(obj2);
		
		System.out.println("obj2 object value after calling m2() method:");
		System.out.println(obj2.x+"....."+obj2.y);

	}
}
		


