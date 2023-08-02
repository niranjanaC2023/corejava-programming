//find the error and out_put(ambiguous error)
package com.nit.sisu.Methods;
class Swag
{
	void m1(int i,float f)
	{
		System.out.println("int,float method");
	}
	 void m1(float f,int i)
	{
		System.out.println("float,int method");
	}
}
class MOV8a
{
	
	public static void main(String[] args) 
	{

		Swag e1=new Swag();

		e1.m1(10,20.345f);
		e1.m1(20.345f,10);
		//e1.m1(10,20);
	}
			
}
