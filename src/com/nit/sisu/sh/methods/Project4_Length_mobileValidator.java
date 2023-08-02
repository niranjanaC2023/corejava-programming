package com.nit.sisu.sh.methods;
import java.util.Scanner;
class Project4_Length_mobileValidator
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter user name");		//problem is: it also take character letter
			String mn = scn.nextLine();
			if(mn.length()!=10)
			{
				System.out.println("Enter 10 digits");
			}
			else
			{
				System.out.println("Hello");
				//break;
			}
		}
	}

}
