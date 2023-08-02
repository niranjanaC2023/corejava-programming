package com.nit.sisu.non_static;
class EXAMPLE29c
{
	int x=m1();
	int m1()
	{
		System.out.println("NSV1 executed");
		return 10;
	}
	{
		System.out.println("NPB1 executed");
	}
	EXAMPLE29c()
	{
		System.out.println("IPC");
	}
	{
		System.out.println("NSC executed");
	}
	EXAMPLE29c(String s)
	{
		System.out.println("SPC executed");
	}
	{
		System.out.println("NSB2 executed");
	}
	int y = m2();
	int m2()
	{
		System.out.println("NSV2 executed");
		return 20;
	}
	public static void main(String[] args)
	{
		System.out.println("MM execution start");
		EXAMPLE29c e1=new EXAMPLE29c();
		EXAMPLE29c e2=new EXAMPLE29c();
		System.out.println("MM execution end");
	}
	int z=m3();
	int m3()
	{
		System.out.println("NSV3 executed");
		return 30;
	}
	{
		System.out.println("NSB3 executed");
	}
	void m4()
	{
		System.out.println("NSM executed");
	}
}




		
	
	

