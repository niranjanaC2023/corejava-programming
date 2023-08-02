package com.nit.sisu.exh;

class MoreTryMoreCatch
{	
	public static void main(String[]args)
	{
			
		
			 try{
					System.out.println("in try1");
				}
			catch(Exception e)		
				{
					System.out.println("in catch1");
				} 

			System.out.println("after try/catch1"); 

			try						
			{
				System.out.println("in try2");
			}
			catch (Exception e)
			{
					System.out.println("in catch2");
			}

			System.out.println("after try/catch1"); 
		}	
}
