//find the error and out_put
package com.nit.sisu.Methods;
class Sriya
{
	void m1(int i)
	{
		System.out.println("int-arg");
	}
	void m1(byte b)
	{
		System.out.println("byte-arg");
	}
}
class MOV6
{
	
	public static void main(String[] args) 
	{
		byte b=10;
		short s=15;
		char ch='a';
		int i=20;


		Sriya e1=new Sriya();
		e1.m1(b);
		e1.m1(s);
		e1.m1(ch);
		e1.m1(i);
		e1.m1(10);
		e1.m1(15);
		e1.m1('a');
		e1.m1(20);
		e1.m1((byte)10);
		e1.m1(15);
		e1.m1('a');
		e1.m1(20);
	
	}
			
}
