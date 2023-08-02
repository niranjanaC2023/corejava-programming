package com.nit.sisu.sh.methods;
import java.util.Scanner;
class Project7_toString_display		
{
	public static void main(String[] args) 
	{
		Scanner bh = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter user name");		//problem is: it also take character letter
			String name = bh.nextLine();
			if(name.isEmpty())
			{
				System.out.println("name can not be empty");
			}
			else if(name.isBlank())
				{
					System.out.println("name can not be space");
					
				}
			
			else
			{
				System.out.println("Hi"+name);
				System.out.println("your name has"+name.length()+"character");
			}
			
		}
	}

}
