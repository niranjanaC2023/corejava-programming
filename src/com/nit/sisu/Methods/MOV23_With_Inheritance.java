package com.nit.sisu.Methods;
class Sekhar
{
	void m1(Object obj)
	{
		System.out.println("Example Object-arg");	
	}
};
class Susanta extends Sekhar
{
	@Override
	void m1(Object obj)
	{
		System.out.println("Sample Object-arg");	
	}
	void m1(String s)
	{
		System.out.println("Sample String-arg");	
	}
};
class MOV23_With_Inheritance
{
	public static void main(String[] args)
	{
		Susanta s1 = new Susanta();
		s1.m1("a");
		s1.m1(10);

		Sekhar e1 = new Susanta();
		e1.m1("a");
		e1.m1(10);
	}
}
