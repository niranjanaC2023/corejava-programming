package com.nit.sisu.exh;
class VariableCreate_TryCatch3
{
	public static void main(String[] args) 
	{
		int a;			//variable initialized both try&catch block
		try
		{
				a=10;
				System.out.println(a);
				
		}
		catch (ArithmeticException ae)
		{
			a=20;
			System.out.println(a);
		}
		System.out.println(a);
		
	}

}
