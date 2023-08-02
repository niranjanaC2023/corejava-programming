package com.nit.sisu.Methods;
class Unit
{
	void m1(float f)
	{
		System.out.println("Example float-arg");
	}
};
class Temp extends Unit
{
	void m1(int a)
	{
		System.out.println("Sample int-arg");	
	}
};
class MOV16_With_Inheritance
{
	public static void main(String[] args)
	{
		Temp s1 = new Temp();

		s1.m1(50);
		s1.m1('a');
		s1.m1(50L);

		Unit e1 = new Temp();
		e1.m1(50);
		e1.m1('a');
		//e1.m1(50L);
	}
}
