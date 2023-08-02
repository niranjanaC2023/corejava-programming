package com.nit.sisu.Methods;
class Trunk
{
	void m1(String s)
	{
		System.out.println("Example String-arg");	
	}
};
class Grass extends Trunk
{
	void m1(Object obj)
	{
		System.out.println("Sample Object-arg");	
	}
};
class MOV21_With_Inheritance
{
	public static void main(String[] args)
	{
		Grass s1 = new Grass();
		s1.m1("a");
		s1.m1(10);

		Trunk e1 = new Grass();
		e1.m1("a");
		//e1.m1(10);
	}
}
