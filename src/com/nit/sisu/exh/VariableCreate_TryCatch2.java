package com.nit.sisu.exh;
class VariableCreate_TryCatch2
{
	public static void main(String[] args) 
	{
		int a;			//variable initialized only try block
		try
		{
				a=10;
				System.out.println(a);
				
		}
		catch (ArithmeticException ae)
		{
			
			//System.out.println(a);
		}
		//System.out.println(a);
		
	}

}
