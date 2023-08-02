package com.nit.sisu.non_static;
class Non_static50
{
	 int x=10;
	static
	{
		//System.out.println("x:"+x);
		//System.out.println("y:"+y);		
	}
	
	
	public static void main(String[] args)
	{
		Non_static50 obj = new Non_static50();
		System.out.println("x:"+obj.x);
		System.out.println("y:"+obj.y);
	}
	int y=20;
}
	




		


