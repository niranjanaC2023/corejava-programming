package com.nit.sisu.sh.methods;
import java.util.Scanner;
class Project9_HashCode	
{
	public static void main(String[] args) 
	{
		Scanner bh = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter number");		
			String s1 = bh.nextLine();
			System.out.println("Enter Number:");
			String io = bh.nextLine();
			
			if(s1.isEmpty())
			{
				System.out.println("name can not be empty");			
//				else if(s1.isBlank())
//				{
//					System.out.println("name can not be space");					
//				}
			}
			else
			{
				try
				{
					Long.parseLong(s1);
					System.out.println(" number can not be a name");
				}
				catch (NumberFormatException e)
				{
					System.out.println("Hii"+s1);
					System.out.println("you name has"+s1.length()+"character");
				}
			}			
		}
	}

}
