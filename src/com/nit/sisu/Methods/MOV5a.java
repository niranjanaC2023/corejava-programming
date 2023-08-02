//find the error and out_put
package com.nit.sisu.Methods;
class Type
{
	static void m1(byte b)
	{
		System.out.println("byte-arg");
	}
}

class MOV5a
{
	
	public static void main(String[] args) 
	{
		//m1(50);
		Type.m1((byte)50);

		byte b=50;
		Type.m1(b);	
	}
			
}
