package com.nit.sisu.non_static;
class Non_static65
{
	Non_static65 obj = new Non_static65();
	static
	{
		System.out.println("SB start");
		System.out.println("SB end");
	}
	{
		System.out.println("NSB start");
		System.out.println("end of NSB");
	}
	Non_static65()
	{
		System.out.println("constructor start");
		System.out.println("constructor end");
	}
	public static void main(String[] args)			//overflow
	{
		System.out.println("main start");
		System.out.println("main end");
	}
	
}



		


