package com.nit.sisu.operators;
class  Bitwise_operator
{
	public static void main(String[] args) 
	{
		System.out.println(5 & 6);				//(output: 4)

		System.out.println(true & true);		//(output: true)

		System.out.println(true & false);		//(output: false)

		System.out.println(false & true);		//(output: false)

		System.out.println(false & false);		//(output: false)

		System.out.println(true | true );		//(output: true)

		System.out.println(true | false);		//(output: true)

		System.out.println(false | true);		//(output: true)

		System.out.println(false | false); 		//(output: false)

		System.out.println(m1() & m2());		//(output: false)	

		System.out.println(m2() & m1());		//(output: false)


		System.out.println(m1() | m2());		//(output: true)

		System.out.println(m2() | m1());		//(output: true)
	}
static boolean m1()
	{
		System.out.println("from m1");
		return false;
	}	
static boolean m2()
	{
			System.out.println("from m2");
			return  true;
	}
		
	
}
