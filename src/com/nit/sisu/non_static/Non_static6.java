package com.nit.sisu.non_static;
class Non_static6
{
	static int a=10;
	static int b=20;

	int x=30;
	int y=40;

	
	public static void main(String[] args) 
	{
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println();

		System.out.println("a:"+Non_static6.a);
		System.out.println("b:"+Non_static6.b);
		System.out.println();

		Non_static6 obj1 = new Non_static6();
		System.out.println("x:"+obj1.x);
		System.out.println("y:"+obj1.y);
		System.out.println();

		System.out.println("a:"+obj1.a);
		System.out.println("b:"+obj1.b);
		System.out.println();

		//System.out.println("x:"+Non_static6.x);
		//System.out.println("y:"+Non_static6.y);

		Non_static6 obj2=null;
		System.out.println("a:"+obj2.a);
		System.out.println("a:"+obj2.x);

	}
}
