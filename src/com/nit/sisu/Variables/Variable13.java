package com.nit.sisu.Variables;
class Variable13
{

	static void m1(int p)
	{
		int q=10;
		if(p==10)
		{
			int r=20;
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		}
		System.out.println(p);
		System.out.println(q);
		//System.out.println(r);	//error
	}


	public static void main(String[] args) 
	{
		m1(10);
		m1(20);

	}
	

}	
