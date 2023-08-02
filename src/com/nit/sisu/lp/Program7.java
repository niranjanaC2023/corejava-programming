//find a numbar is Pallindrome or not....?
package com.nit.sisu.lp;
import java.util.Scanner;
class Program7
{
	public static void main(String[] args) 
	{
		
		Scanner scn =  new Scanner(System.in);
		
		System.out.println("enter a number:");
		int num=scn.nextInt();
		int rev=0,rem=0;
		int temp=num;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev)
				System.out.println(" number is pallindrome");
		else	
				System.out.println(" number is NOT pallindrome");
		
	}
}