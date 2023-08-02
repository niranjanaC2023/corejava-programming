package com.nit.sisu.non_static;

class A
{
	void m1()
	{
		B b = new B();
		b.m2(this);
	}
		void print(String msg)
		{
			System.out.println(msg);
		}
}
class B
{
	void m2(A a)
	{
		a.print("msg");
	}
}
class Non_static81
{
     	
	static
		{
		System.out.println("Example SB----class is loaded");
		}

	public static void main(String[] args)throws ClassNotFoundException
	{
		A a = new A();
		a.m1();
	}
}
	



		


