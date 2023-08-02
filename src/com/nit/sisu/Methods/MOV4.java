//find the error and out_put
package com.nit.sisu.Methods;
class MOV4
{
	
	static void m1(int a)
	{
		System.out.println("int-arg");
	}
	static void m1(float f)
	{
		System.out.println("float-arg");
	}

	public static void main(String[] args) 
	{
		m1(10);
		m1('a');
		m1(50L);


		long L=50;
		m1(L);

		//m1(50.34);
	}
			
}
