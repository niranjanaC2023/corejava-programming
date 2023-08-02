package com.nit.sisu.sh.methods;
import java.util.Scanner;
class Project3_isBlank
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter user name");
			String usn = scn.nextLine();
			if(usn.isBlank())
			{
				System.out.println("username can't be empty and can't be space");
			}
			else
			{
				System.out.println("Hi"+usn+",welcome");
				break;
			}
		}
	}

}
