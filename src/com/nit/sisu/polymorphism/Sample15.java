package com.nit.sisu.polymorphism;
class Smart
{
	static int a=10;
	int x=20;

	static
	{
		System.out.println("A is loaded");
	}
		
}
class Mart extends Smart
{
	static int b=30;
	int y=40;
	static
	{
		System.out.println("B is loaded");
	}
}
class Chart extends Smart
{
	static int c=50;
	int z=60;
	static
	{
		System.out.println("C is loaded");
	}
}
class Sample15
{
	static
	{
		System.out.println("Sample15 is loaded");		//static block first executed
	}
	public static void main(String[] args) 
	{
		Mart b1 = new Mart();
		Chart c1 = new Chart();

		b1.a=15;
		b1.x=16;
		System.out.println("b1.a:"+b1.a);
		System.out.println("c1.a:"+c1.a);

		System.out.println("b1.x:"+b1.x);
		System.out.println("c1.x:"+c1.x);


	}
}
