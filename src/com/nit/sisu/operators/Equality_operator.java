package com.nit.sisu.operators;
class  Equality_operator
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int c=20;
		System.out.println(a==b);				//(output: false )

		System.out.println(a!=b);				//(output: true )

		System.out.println(true==false);		//(output: false )
		
		System.out.println(false==false);		//(output: true)

		System.out.println(null==null);			//(output: true )

		System.out.println(10==10);				//(output: true )

		System.out.println(10==10.0);			//(output: true )

		System.out.println(10.0f==10.0);		//(output: true)

		System.out.println(10.5f==10.5);		//(output: true )

		System.out.println(10.51f==10.51);		//(output: false )

		System.out.println(10.50f==10.50);		//(output: true )

		System.out.println(10.1f==10.1);		//(output: false )

		System.out.println(10.2f==10.2);		//(output: false )

		System.out.println(10.3f==10.3);		//(output: false )

		System.out.println(10.6f==10.6);		//(output: false )

	}
}
