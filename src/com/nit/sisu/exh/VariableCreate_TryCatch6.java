package com.nit.sisu.exh;
class VariableCreate_TryCatch6
{
	public static void main(String[] args) 
	{
		VariableCreate_TryCatch6 v1 = new VariableCreate_TryCatch6();	
		v1.m1();
	}

		void m1()
		{
			int a;			//variable initialized both try block and catch block and finally 169pg

			try
			{
					a=10;
						System.out.println(a);
				
					
			}
			catch (ArithmeticException ae)
			{
				a=20;
			}
			finally
			{
					a=30;
			}
			System.out.println(a);
		}
	

}
