//find the error and out_put
package com.nit.sisu.Methods;
class MOV5
{
	static void m1(byte b)
	{
		System.out.println("byte-arg");
	}
	
	public static void main(String[] args) 
	{
		//m1(50);
		m1((byte)50);

		byte b=50;
		m1(b);	
	}
			
}
