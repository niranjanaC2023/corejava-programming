package com.nit.sisu.superclass;
class A1
{
	A1()
	{
		System.out.println("in class A constructor this:"+this);
	}
}
class B1 extends A1
{
	B1()
	{	
		
		System.out.println("in class B constructor this:"+this);
	}
}
class Sample6
{

	public static void main(String[] args) 
	{
		B1 b1 = new B1();
		System.out.println("in class test main b1:"+b1);
	}
}
