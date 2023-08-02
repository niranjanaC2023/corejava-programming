package com.nit.sisu.sh.methods;
import java.util.Scanner;
class Project1_isEmpty 
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
				System.out.println("welcome");
			}
		}
	}
}
