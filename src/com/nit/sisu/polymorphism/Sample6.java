package com.nit.sisu.polymorphism;
class Open
{
	Open()
	{
		System.out.println("in class A constructor this:"+this);
	}
}
class Close extends Open
{
	Close()
	{	
		
		System.out.println("in class B constructor this:"+this);
	}
}
class Sample6
{

	public static void main(String[] args) 
	{
		Close b1 = new Close();
		System.out.println("in class test main b1:"+b1);
	}
}
