package com.nit.sisu.non_static;
class Non_static54
{
	 int x=10;
	{
		System.out.println("x:"+x);
		System.out.println("y:"+getY());		
	}
	
	
	public static void main(String[] args)
	{
		Non_static54 obj = new Non_static54();
		System.out.println("x:"+obj.x);
		System.out.println("y:"+obj.y);
	}
	 int getY()
	{
		return y;
	}
	 int y=20;
}
	




		


