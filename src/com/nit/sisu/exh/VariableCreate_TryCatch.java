package com.nit.sisu.exh;
class VariableCreate_TryCatch
{
	public static void main(String[] args) 
	{
		int a=10;			//variable initialized in try block only
		try
		{
				int b=20;
				System.out.println(a);
				System.out.println(b);
		}
		catch (ArithmeticException ae)
		{
			a=30;
			//b=40;
		}
		System.out.println(a);
		//System.out.println(b);
	}

}
