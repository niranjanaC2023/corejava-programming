package com.nit.sisu.exh;

class Inner_Try_Catch8
{	
	public static void main(String[]args)
	{
																	//exception raised in inner class,inner catch matched
																	//again exception raised in inner catch, then who will catch it???
		
			 try																		//a)outer catch is not matched
			 {																								
					
					System.out.println("in outer try");
					try
					{
						System.out.println("in inner try");
						System.out.println(10/0);
					}
					
					catch(ArithmeticException ae)		
					{
							System.out.println("in inner catch");
							System.out.println(10/0);
					}
					System.out.println("after inner try/catch");
				}
			catch(NumberFormatException e)		
				{
					System.out.println("in outer catch");
				}
			System.out.println("after outer try/catch");

			
		}	
}
