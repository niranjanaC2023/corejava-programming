package com.nit.sisu.non_static;
class Non_static17
{
	int x=10;
	int y=20; 
	
	
	public static void main(String[] args) 
	{
		Non_static17 obj1 = new Non_static17();
		Non_static17 obj2 = new Non_static17();
		Non_static17 obj3 = obj2;                                                                                                                                               

		obj2.x=70;
		obj2.y=80;
		

		System.out.println(obj1.x+"..."+obj1.y);
		
		System.out.println(obj2.x+"..."+obj2.y);
		
		System.out.println(obj3.x+"..."+obj3.y);
		
		
	}
}
