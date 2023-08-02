package com.nit.sisu.Methods;
class Source
{
	void m1(String s)
	{
		System.out.println("Example String-arg");	
	}
	void m1(Integer io)
	{
		System.out.println("Example Object-arg");
	}
};
class Dest extends Source
{
	void m1(Object obj)
	{
		System.out.println("Sample Object-arg");	
	}
	@Override
	void m1(String s)
	{
		System.out.println("Sample String-arg");	
	}
	@Override
	void m1(Integer io)
	{
		System.out.println("Sample Integer-arg");	
	}
};
class MOV22_With_Inheritance
{
	public static void main(String[] args)
	{
		Dest s1 = new Dest();
		s1.m1("a");
		s1.m1(10);

		Source e1 = new Dest();
		e1.m1("a");
		e1.m1(10);
	}
}
