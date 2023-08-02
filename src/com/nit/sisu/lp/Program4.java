//fiind the digits of given input number...?
package com.nit.sisu.lp;
import java.util.Scanner;
class Program4
{
	public static void main(String[] args) 
	{
		
		Scanner scn =  new Scanner(System.in);
		
		System.out.println("enter a number:");
		int num=scn.nextInt();
		int digits=0;
		while(num!=0)
		{
			num=num/10;
			digits++;
			
		}
		System.out.println("total digits of that that number is:"+digits);
		
	}
}
