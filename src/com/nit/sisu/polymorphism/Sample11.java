package com.nit.sisu.polymorphism;
class Just
{
	int x=10;
	int y=20;
}
class ChildJust extends Just
{
	int x=30;
	int y=40;
	
}

class Sample11
{
	public static void main(String[] args) 
	{
		ChildJust b1  =  new ChildJust();
		Just a1  =  new ChildJust();

		System.out.println(b1.x+"..........."+b1.y);		//if we access a variable using sub class refernced variable then it is executed  from sub class
																
		System.out.println(a1.x+"........"+a1.y);			//if we access a variable using super class refernced variable then it is executed  from super class


		b1.x=5;
		a1.x=6;


		System.out.println(b1.x+"..........."+b1.y);
		System.out.println(a1.x+"........"+a1.y);

	}
};
