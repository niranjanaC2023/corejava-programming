package com.nit.sisu.Methods;
class SuperClass
{
	SuperClass()
	{
		this(10);
		System.out.println("SuperClass No-arg constructor-chaining");
	}
	
	SuperClass(int a)
	{
		this("abc");
		System.out.println("SuperClass int-arg constructor-chaining");
	}
	
	SuperClass(String str)
	{
		System.out.println("SuperClass String-arg constructor-chaining");
	}
}
class SubClass extends SuperClass
{
	SubClass()
	{
		this(10);
		System.out.println("SubClass no-arg constructor-chaining");
	}
	SubClass(int a)
	{
		this("abc");
		System.out.println("SubClass int-arg constructor-chaining");
	}
	SubClass(String str)
	{
		
		System.out.println("SubClass String-arg constructor-chaining");
	}
}

class Const_chaining
{

	public static void main(String[] args) 
	{
		new SubClass();

		System.out.println();
		//new SubClass(10);

		System.out.println();
		//new SubClass("abc");

	}
}
