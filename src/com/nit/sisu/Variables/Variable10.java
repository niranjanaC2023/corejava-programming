package com.nit.sisu.Variables;
class Variable10
{

	static int a=10;
	static int b=20;

	int x=30;
	int y=40;
	public static void main(String[] args) 
	{
		int p=50;
		int q=60;
		System.out.println("a:"+a);
		System.out.println("b:"+b);

		//System.out.println("x:"+x);
		//System.out.println("y:"+y);

		Variable10 v1 = new Variable10();
		System.out.println("x:"+v1.x);
		System.out.println("y:"+v1.y);

		System.out.println("p:"+p);
		System.out.println("q:"+q);

		Example e1 = new Example();	//example is the default cls
		System.out.println("x:"+e1.x);

	}
	

}	
