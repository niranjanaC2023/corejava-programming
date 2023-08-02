package com.nit.sisu.superKeyword;
class Test   //super const always in first line of any sub class const  
{
	Test()
	{
		System.out.println("Hi ..I'm Non-arg Constructor");
	}
	int x=10;
	Test(int x)
	{
		System.out.println("Hi ..I'm arg Constructor");
	}
	public void m1()
	{
		System.out.println("Hi ..I'm m1() method");	
	}	
}
class Test1 extends Test
{
	Test1()
	{	super();	//By default it calls super class constructor, uf we don't mention it then also compiler calls it..(Bydefault compiler always non-arg type)
					//if we don't wants bydefault construtor then we manually need to call..see below we call manually..
					//Access super class constructor in sub class
	//super(5);	//constructor always call in firstline
		System.out.println(super.x);//Access super class variable in sub class
		System.out.println("bye");	
		super.m1();//Access super class method in sub class
	}
	public void m2()
	{
		super.m1();
	}		
}
class Sample1
{

	public static void main(String[]args)
	{
		Test1 t1 = new Test1();
		t1.m2();
	}
}


