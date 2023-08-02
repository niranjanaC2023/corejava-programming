package com.nit.sisu.Variables;
class Variable15
{

	 int x=10;
	static void m1()
	{
		Example e1 = new Example();
		System.out.println(e1.x);
	}

	public static void main(String[] args) 
	{
		Example e2 = new Example();
		System.out.println(e2.x);
		//System.out.println(e1.x);
		m1();
	}
	

}	
