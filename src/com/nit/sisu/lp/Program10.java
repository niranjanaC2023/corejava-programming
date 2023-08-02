//WAP to find sum of even digit and sum of odd digits in a given number?
package com.nit.sisu.lp;
import java.util.Scanner;
class Program10
{
	public static void main(String[] args) 
	{
		
		Scanner scn =  new Scanner(System.in);
		
		System.out.println("enter a number:");
		int n = scn.nextInt();
		
		int es=0,os=0,rem=0;
		while(n!=0)
		{
			rem=n%10;
			if(rem%2==0)
				es=es+rem;
			else
				os=os+rem;

			n=n/10;
			
		}
		System.out.println("sum of even number are:"+es);
		System.out.println("sum of odd number are:"+os);

		
		
		
	}
}