package com.nit.sisu.Methods;
class Eng
{
	void m1(int a)
	{
		System.out.println("Example int-arg");
	}
};
class Samples extends Eng
{
	void m1(float f)
	{
		System.out.println("Sample float-arg");	
	}
};
class MOV15_With_Inheritance
{
	public static void main(String[] args)
	{
		Samples s1 = new Samples();

		s1.m1(50);
		s1.m1('a');
		s1.m1(50L);

		Eng e1 = new Samples();
		e1.m1(50);
		e1.m1('a');
		//e1.m1(50L);
	}
}
