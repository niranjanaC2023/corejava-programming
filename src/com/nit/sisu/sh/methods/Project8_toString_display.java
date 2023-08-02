package com.nit.sisu.sh.methods;
import java.util.Scanner;
class Project8_toString_display		
{
	public static void main(String[] args) 
	{
		Scanner bh = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter user name");		
			String name = bh.nextLine();
			if(name.isEmpty())
			{
				System.out.println("name can not be empty");
//				else if(name.isBlank())
//				{
//					System.out.println("name can not be space");
//					
//				}
			}
			else
			{
				try
				{
					Long.parseLong(name);
					System.out.println(" number can not be a name");
				}
				catch (NumberFormatException e)
				{
					System.out.println("Hii"+name);
					System.out.println("you name has"+name.length()+"character");
				}
			}
			
		}
	}

}
