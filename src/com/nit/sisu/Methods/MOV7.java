//find the error and out_put
package com.nit.sisu.Methods;
class Shree
{
	void m1(float f)
	{
		System.out.println("float-arg");
	}
	void m1(char ch)
	{
		System.out.println("char-arg");
	}
	void m1(double d)
	{
		System.out.println("double-arg");
	}
}
class MOV7
{
	
	public static void main(String[] args) 
	{

		Shree e1=new Shree();
		e1.m1(10);
		e1.m1('a');
		e1.m1(45L);
		//e1.m1(4.5);

		//e1.m1(10);
		e1.m1('a');
		//e1.m1("a");
		e1.m1(54L);
		e1.m1(46.043f);

		e1.m1(10);
		e1.m1('a');
		e1.m1(54L);
		e1.m1(46.043f);
		e1.m1(568.954);
		//e1.m1(true);

		
	
	}
			
}
