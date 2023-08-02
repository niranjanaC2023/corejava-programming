package com.nit.sisu.exh;
class Checkes_UncheckesException
{
	/*static void m1()
	{
		throw new ArithmeticException();	// AE is unchecked exception so don't need to use catch
	}

	static void m2()
	{
		throw new ClassNotFoundException();		//CNFE is checked exception so need to use catch
		//throw "a";								// String cannot be converted to Throwable
	}


	static void m3()
	{
		try{
			throw new ClassNotFoundException();		//CNFE is checked exception so need to use catch
			}
		catch(ClassNotFoundException e)
		{
		}
	}*/
	
	static void m4() throws ClassNotFoundException
	{
		
			throw new ClassNotFoundException();		//CNFE is checked exception so need to use catch but m4() not catch it just informed to its calling method
			
	}
	

	/*static void m5()			//exception raised because m4() reported but m5() not catched it
	{
		m4();
	}*/

	static void m6()
	{
		try
		{
			m4();
		}
		catch (ClassNotFoundException e)
		{
			//e.printStackTrace;
		}
	}


	static void m7() throws ClassNotFoundException
	{
		m4();
	}

	static void m8()
	{
		try
		{
			
		}
		catch (ArithmeticException ae)		//unchecked exceptions 
		{
		}

		catch (NullPointerException e)		//unchecked exceptions 
		{
		}
	/*	catch (ClassNotFoundException ae)		//checked exceptions so handle it 
		{
		}*/

		/*catch (InterruptedException ae)		//checked exceptions so handle it
		{
		}*/
		catch (Error ae)		//unchecked exceptions 
		{
		}

		/*catch (Exception ae)		//checked exceptions so handle it
		{
		}*/

		catch (Throwable ae)		//partial exceptions both checked & unchecked
									//there two partial exceptions i.e throw,exception
		{
		}
	}

	static void m81()
	{
			//throw new Exception ();			////checked exceptions so handle it
			//throw new Throwable();			//checked exceptions so handle it
	}

	static void m9() throws ClassNotFoundException
	{
		
			
	}

	static void m10()
	{
		//m9();			//m9 method reported so m10 must be handle it
	}
	public static void main(String[]args)
	{
		//m7();
		System.out.println("main end");
	}

	
}
