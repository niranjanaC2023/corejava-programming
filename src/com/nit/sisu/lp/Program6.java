//can u reverse a  number...?
package com.nit.sisu.lp;
import java.util.Scanner;
class Program6
{
	public static void main(String[] args) 
	{
		
		Scanner scn =  new Scanner(System.in);
		
		System.out.println("enter a number:");
		int num=scn.nextInt();
		int rev=0,rem=0;
		
		while(num==0)
		{
			
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("the reverse number is :"+rev);
		
	}
}
