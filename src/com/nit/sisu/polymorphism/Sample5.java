package com.nit.sisu.polymorphism;
class Nurse
{
	 private void m1()
	{
		System.out.println("Example m1");
	}
	void m2()
	{
		System.out.println("Example m2");
		m1();
	}

}

class Sample5 extends Nurse 
{
	 void m1()
	{
		System.out.println("sample5 m1");
	}
	public static void main(String[] args) 
	{
		Sample5 s1 = new Sample5();
		s1.m1();	s1.m2();	
		

		Nurse a1 = new Sample5();
		//a1.m1();		//method is private in Example class
		a1.m2();	
	}
}
