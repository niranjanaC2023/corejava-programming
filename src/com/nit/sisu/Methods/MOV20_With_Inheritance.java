package com.nit.sisu.Methods;
class Water
{
	void m1(Object obj)
	{
		System.out.println("Example Object-arg");	
	}
};
class Drink extends Water
{
	void m1(String s)
	{
		System.out.println("Sample String-arg");	
	}
};
class MOV20_With_Inheritance
{
	public static void main(String[] args)
	{
		Drink s1 = new Drink();
		s1.m1("a");
		s1.m1(10);

		Water e1 = new Drink();
		e1.m1("a");
		e1.m1(10);
	}
}
