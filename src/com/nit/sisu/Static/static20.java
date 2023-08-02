package com.nit.sisu.Static;
/*class Example25
{

}*/
/*class Example
{
	static
	{
		System.out.println("SB");
	}
}*/

/*class Example27
{
	static int a=m1();
	{
		System.out.println("SV:a");
		return 10;

	}
}*/
/*class Example28
{
	static int a=m1();
	static int m1()
	{
		System.out.println("SV:a");
		return 10;
	}
	static
	{
		System.out.println("SB");
	}
}*/
class  static20
{
	static
	{
		System.out.println("SB");
	}
	static int a=m1();
	static int m1()
	{
	System.out.println("SV:a");
		return 10;
	}

	public static void main(String[] args) 
	{
		System.out.println("main");
			
	}
}
