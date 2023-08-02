package com.nit.sisu.Methods;
class Move
{
	void m1(int a)
	{
		System.out.println("Example int-arg");
	}
	void m1(char ch)
	{
		System.out.println("Example char-arg");	
	}
};
class Samply extends Move
{
	void m1(float f)
	{
		System.out.println("Sample float-arg");	
	}
	@Override
	void m1(char ch)
	{
		System.out.println("Sample char-arg");	
	}
};
class MOV18_With_Inheritance
{
	public static void main(String[] args)
	{
		Samply s1 = new Samply();

		s1.m1(50);
		s1.m1('a');
		s1.m1(50L);

		Move e1 = new Samply();
		e1.m1(50);
		e1.m1('a');
		//e1.m1(50L);
	}
}
