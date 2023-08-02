package com.nit.sisu.non_static;
class Non_static21
{
	int x;
	int y;
	void m1(Non_static21 obj)
	{
		x=x+1;			//modifying current object values
		y=y+2;

		obj.x=obj.x+3;		//modifying argument object values
		obj.y=obj.y+4;
	}
	
	public static void main(String[] args) 
	{
		Non_static21 obj1 = new Non_static21();
		Non_static21 obj2 = new Non_static21();

		obj1.m1(obj2);
		System.out.println(obj1.x+"......."+obj1.y);
		System.out.println(obj2.x+"......."+obj2.y);
		System.out.println();

		obj2.m1(obj1);
		System.out.println(obj1.x+"......."+obj1.y);
		System.out.println(obj2.x+"......."+obj2.y);
		System.out.println();

		obj1.m1(obj1);
		System.out.println(obj1.x+"......."+obj1.y);
		System.out.println(obj2.x+"......."+obj2.y);
		System.out.println();

		obj2.m1(obj2);
		System.out.println(obj1.x+"......."+obj1.y);
		System.out.println(obj2.x+"......."+obj2.y);


		
		

	}
}
		


