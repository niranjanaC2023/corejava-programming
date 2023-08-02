package com.nit.sisu.non_static;
class Non_static52
{
	 int x=10;
	{
		System.out.println("x:"+x);
		System.out.println("y:"+this.y);		
	}
	
	
	public static void main(String[] args)
	{
		Non_static52 obj = new Non_static52();
		System.out.println("x:"+obj.x);
		System.out.println("y:"+obj.y);
	}
	int y=20;
}
	




		


