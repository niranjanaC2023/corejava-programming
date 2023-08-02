package com.nit.sisu.Methods;
final class Ghosh
{
	int x=10;
	final int y=20;

	void m1()
	{
		System.out.println("Example m1");
	}
	final void m2()
	{
		System.out.println("Example m2");
	}
}
/*class Const_chaining4 extends Example
{
}*/
class Const_chaining4 
{
	public static void main(String[] args) 
	{
		Ghosh e1 = new Ghosh();
		e1.x=50;
		//e1.y=60; //error: final property can not be modify

		e1.m1();
		e1.m2();
	}
}
