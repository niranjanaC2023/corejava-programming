package com.nit.sisu.Static;
class Example46
{
	 int x=10;
	{
		System.out.println("from NSB");
		System.out.println("x:"+x);
		//System.out.println("Y:"+y);
		System.out.println(this.y);
	}
	Example46()
	{
		System.out.println("from constructor");
		System.out.println("x:"+x);
		System.out.println("Y:"+y);
	}

	public static void main(String[] args) 
	{
		System.out.println("main start");
		Example46 e1=new Example46();
		System.out.println("x:"+e1.x);
		System.out.println("y:"+e1.y);
		System.out.println("main end");

	}
	int y=20;
	
	
}
