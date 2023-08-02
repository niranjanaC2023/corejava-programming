package com.nit.sisu.exh;
class VariableCreate_TryCatch4
{
	public static void main(String[] args) 
	{
		VariableCreate_TryCatch4 v1 = new VariableCreate_TryCatch4();	
		v1.m1();
	}

		void m1()
		{
			int a;			//variable initialized both try block and one catch block only
			try
			{
					a=10/0;
					System.out.println(a);
					
			}
			catch (ArithmeticException ae)
			{
				a=20;
			}
			catch(NullPointerException e)
			{
				//System.out.println(a);
			}
			//System.out.println(a);
		}
	

}
