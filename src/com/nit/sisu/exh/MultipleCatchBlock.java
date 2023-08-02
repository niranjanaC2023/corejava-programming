package com.nit.sisu.exh;

class MultipleCatchBlock
{	
	public static void main(String[]args)
	{
			
		
			 try{
					
					System.out.println(10/0);
				}
			
			catch(ArithmeticException ae)		
				{
					System.out.println("getMessage()method output");
					System.out.println(ae.getMessage());


					System.out.println("toString()method output");
					System.out.println(ae.toString());



					System.out.println("printStackTrace()method output");
					ae.printStackTrace();

					System.out.println("JVM default output");
					throw ae;

																	//exception is caught by jvm default handler
				}

			
		}	
}
