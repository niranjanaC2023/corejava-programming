package com.nit.sisu.exh;
class Return_Stmt_TryCatch1
{
	public static void main(String[] args)			//170pg//return stmt only in try block
	{
		Return_Stmt_TryCatch1 r1 = new Return_Stmt_TryCatch1();
		r1.m1();
	}

		int m1()
		{
				try
				{
					System.out.println("in try");
					return 10;
				}
				catch (ArithmeticException e)
				{
					System.out.println("in catch");
				}
				System.out.println("after try/catch/finally:");
				return 10;
		}
	

}
