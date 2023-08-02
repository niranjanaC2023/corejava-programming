package com.nit.sisu.superclass;
class A3
{
	int x=10;
	int y=20;
}
class B3 extends A3
{
	int x=30;
	int y=40;
	
}

class Sample11
{
	public static void main(String[] args) 
	{
		B3 b1  =  new B3();
		A3 a1  =  new B3();

		System.out.println(b1.x+"..........."+b1.y);		//if we access a variable using sub class refernced variable then it is executed  from sub class
																
		System.out.println(a1.x+"........"+a1.y);			//if we access a variable using super class refernced variable then it is executed  from super class


		b1.x=5;
		a1.x=6;


		System.out.println(b1.x+"..........."+b1.y);
		System.out.println(a1.x+"........"+a1.y);

	}
};
