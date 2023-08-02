//referenced type widening
package com.nit.sisu.Methods;
class Devi
{
	void m1(Devi e)
	{
		System.out.println("Example");
	}
}
class Devika extends Devi
{
	void m1(Devika s)
	{
		System.out.println("Sample");
	}
}
class MOV8
{
	
	public static void main(String[] args) 
	{

		Devika s1=new Devika();

		s1.m1(new Devi());
		s1.m1(new Devika());
		//s1.m1(new Test());
		//s1.m1("abc");
		s1.m1(null);
	}
			
}
