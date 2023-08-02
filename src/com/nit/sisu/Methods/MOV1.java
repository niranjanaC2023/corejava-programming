//find the error
package com.nit.sisu.Methods;
class MOV1 
{
	void add()
	{
		System.out.println("no-arg add");
	}
	void add(int a)
	{
		System.out.println("int-arg add");
	}
	void add(String str)
	{
		System.out.println("string-arg add");
	}
	/*int add(String s)
	{
		System.out.println("string-arg add");
	}*/

	public static void main(String[] args) 
	{
		MOV1 m1= new MOV1();

		m1.add();
		m1.add(10);
		m1.add("abc");

	}
}
