package com.nit.sisu.sh.methods;
import java.util.Scanner;
class Project2_isEmpty_With_trim 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter user name");
			String usn = scn.nextLine();
			
			if(usn.isEmpty())
			{
				System.out.println("username can't be empty");
			}
			else
			{
				if(usn.trim().isEmpty())
				{
					System.out.println("username can't be space");
				}
				else
				{
					System.out.println("welcome");
					break;
				}
			}
		}
	}

}
