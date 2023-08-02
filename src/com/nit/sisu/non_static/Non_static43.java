package com.nit.sisu.non_static;
class Non_static43
{
	int x=10,y=20;

	Non_static43(int X,int Y)
	{
		this.x=X;
		this.y=Y;
	}
	
	public static void main(String[] args)
	{
	Non_static43 obj1 = new Non_static43(5,6);
	Non_static43 obj2 = new Non_static43(5,6);
	Non_static43 obj3 = new Non_static43(7,8);
	}
	
	
}




		


