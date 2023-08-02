package com.nit.sisu.Methods;
class Sugar
{
	void m1(int a)
	{
		System.out.println("Example int-arg");
	}
};
class Sugarcane extends Sugar
{
	void m1(float f)
	{
		System.out.println("Sugarcane float-arg");	
	}
	void m1(char ch)
	{
		System.out.println("Sugarcane char-arg");	
	}
};
class MOV17_With_Inheritance
{
	public static void main(String[] args)
	{
		Sugarcane s1 = new Sugarcane();

		s1.m1(50);
		s1.m1('a');
		s1.m1(50L);

		Sugar e1 = new Sugarcane();
		e1.m1(50);
		e1.m1('a');
		//e1.m1(50L);
	}
}
