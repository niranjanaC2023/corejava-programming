package com.nit.sisu.exh;
class VariableCreate_TryCatch5
{
	public static void main(String[] args) 
	{
		VariableCreate_TryCatch5 v1 = new VariableCreate_TryCatch5();	
		v1.m1();
	}

		void m1()
		{
			int a;			//variable initialized both try block and catch block but no finally
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
					//System.out.println(a);
			}
		}
	

}
