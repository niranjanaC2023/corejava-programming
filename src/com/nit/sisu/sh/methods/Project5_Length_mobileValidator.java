package com.nit.sisu.sh.methods;
import java.util.Scanner;
class Project5_Length_mobileValidator
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter user name");		//problem is: it also take character letter
			String mobile = scn.nextLine();
			if(mobile.length()!=10)
			{
				System.out.println("Enter 10 digits");
			}
			else
			{
				try
				{
					Long mn = Long.parseLong(mobile);
				}
				catch (NumberFormatException e)
				{
					System.out.println("Enter only digits");
					
				}
				
			}
			
		}
	}

}
