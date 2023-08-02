package com.nit.sisu.non_static;
class Non_static23
{
	int x=10,y=20;
	void m1(Non_static23 obj)
	{
		System.out.println("\tobj:"+obj);
		obj=new Non_static23();
		System.out.println("\tobj:"+obj);	

	}

	
	public static void main(String[] args) 
	{
		Non_static23 obj1 = new Non_static23();
		Non_static23 obj2 = new Non_static23();
		System.out.println("obj2:"+obj2);
		
		obj1.m1(obj2);
		
		System.out.println("obj2:"+obj2);

	}
}
		


