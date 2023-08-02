//find the error
package com.nit.sisu.Methods;
class MOV3
{
	
	public void foo(Object o)
	{
		System.out.println("object parameter");
	}
	public void foo(String s)
	{
		System.out.println("string parameter");
	}
	public void foo(Integer i)
	{
		System.out.println("integer parameter");
	}
	public static void main(String[] args) 
	{
		MOV3 m3= new MOV3();
		
		Object ob1=new Object();
		Object ob2="harikrishna";
		Object ob3=new Integer(7279);

		m3.foo(ob1);
		m3.foo(ob2);
		m3.foo(ob3);

		m3.foo("hk");
		m3.foo(7279);

		m3.foo((String)ob2);
		m3.foo((Integer)ob3);

		//m3.foo((String)ob1);
		//m3.foo((Integer)ob1);
		//m3.foo((String)ob3);
		//m3.foo((Integer)ob2);

		Integer io=7279;
		//m3.foo((String)io);
	}
			
}
