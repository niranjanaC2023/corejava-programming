package com.nit.sisu.sh.methods;
import java.util.Scanner;
class Project6_Length_mobileValidator		//public int length()
{
	public static void main(String[] args) 
	{
		Scanner bh = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter user name");		//problem is: it also take character letter
			String mobile = bh.nextLine();
			if(mobile.length()!=10)
			{
				System.out.println("Enter 10 digits");
			}
			else
			{
				try
				{
					Long mn = Long.parseLong(mobile);
					System.out.println("otp sent to your mobile number");
					System.out.println("enter please here");
					String otp = bh.nextLine();
					break;
				}
				catch (NumberFormatException e)
				{
					System.out.println("Enter only digits");
					
				}
				
			}
			
		}
	}

}
