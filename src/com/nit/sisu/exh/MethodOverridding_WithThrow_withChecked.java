package com.nit.sisu.exh;
//CASE:::1
/*class A
{	
	void m1()
	{
	}
}
class B extends A
{	
	void m1()
	{
	}
}
class C extends A
{	
	void m1() throws RuntimeException		//unchecked exception
	{
	}
}
class D extends A
{	
	void m1() //throws Exception			//checked exception must be handle it
	{
	}
}*/

//CASE::::2
class A
{

	void m1() throws InterruptedException //in overriding,if superclass method is checkedd exception then subclass overriding method may or may not throw checked excp.
	{
	}
}
class B extends A
{

	@Override
	void m1() throws InterruptedException
	{
	}
}
class C extends A
{

	@Override
	void m1()							//overridding methods remove throws 
	{
	}
}
class D extends A
{

	@Override
	void m1()//throws Exception		//exception raised due to Exception is super class type so cant be override	
	{
	}
}
class E extends A
{

	@Override
	void m1() //throws ClassNotFoundException	//exception raised due to checked exception (sibling type) so can't override
	{
	}
}
class F extends A
{

	@Override
	void m1() throws InterruptedException//,ClassNotFoundException	//override method has more checked exception
	{
	}
}

class G extends A
{

	@Override
	void m1() throws InterruptedException,ArithmeticException	//override method has checked or unchecked so no exception raised
	{
	}
}
class H extends A
{

	@Override
	void m1() 
	{
		//super.m1();	//exception raised because super class method i throwing exception  so we must be report or catch it 
	}
}
class I extends A
{

	@Override
	void m1() throws  InterruptedException
	{
		super.m1();	
	}
}

class J extends A
{

	@Override
	void m1() 
	{
		try
		{
			super.m1();	
		}
		catch (InterruptedException e)
		{
		}
	}
}

class K
{
	static void m2() throws ClassNotFoundException
	{
	}
}

/*class L extends A
{
	void m1() throws ClassNotFoundException
	{
		K.m2();
	}
}*/
class M extends A
{
	@Override
	void m1() 
	{
		try
		{
			K.m2();
		}
		catch (ClassNotFoundException e)
		{
		}
		
	}
}
class MethodOverridding_WithThrow_withChecked 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
