package com.nit.sisu.exh;
class ThrowPractice3 //throws ArithmeticException
{
	//throw new ArithmeticException();
	

	static //throws  ArithmeticException
	{
		//throw new ArithmeticException ();
	}

	
	ThrowPractice3() throws  ArithmeticException
	{
		throw new ArithmeticException();
	}
	


	void m1() throws  ArithmeticException
	{
		throw new ArithmeticException();
	}

	
	

	void m2() //throw   ArithmeticException
	{
		//throws ArithmeticException();
	}

	

	void m3() //throws  String
	{
		//throw "abc";
	}

	

	void m4() 
	{
		throw new ArithmeticException();
		//System.out.println("hi");
	}
	//System.out.println("hi");

	
	void m5() 
	{
		if(true)
		{
			throw new ArithmeticException();
		}
		System.out.println("hi");
	}


	void m6() 
	{
		//throw new ArithmeticException();
		//throw new IllegalArgumentException();
		
	}

	int x;
	void m7() 
	{
			//int x;
			if(x<0)
			{
			throw new ArithmeticException();
			}
			throw new IllegalArgumentException();
	}
	

}
