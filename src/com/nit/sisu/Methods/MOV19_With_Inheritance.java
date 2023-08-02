package com.nit.sisu.Methods;
class Milk
{
	void m1(float f)
	{
		System.out.println("Example float-arg");	
	}
};
class Sampl extends Milk
{
	void m1(int a)
	{
		System.out.println("Sample int-arg");	
	}
	void m1(long l)
	{
		System.out.println("Sample long-arg");	
	}
	@Override
	void m1(float f)
	{
		System.out.println("Sample float-arg");	
	}
};
class MOV19_With_Inheritance
{
	public static void main(String[] args)
	{
		Sampl s1 = new Sampl();

		s1.m1(50);
		s1.m1('a');
		s1.m1(50L);

		Milk e1 = new Sampl();
		e1.m1(50);
		e1.m1('a');
		//e1.m1(50L);
	}
}
