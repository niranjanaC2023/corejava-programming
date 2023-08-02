//find a factrorial number?
package com.nit.sisu.lp;
import java.util.Scanner;
class Program8
{
	public static void main(String[] args) 
	{
		
		Scanner scn =  new Scanner(System.in);
		
		System.out.println("enter a number:");
		int n = scn.nextInt();
		
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factor of that number is :"+fact);

		
		
		
	}
}