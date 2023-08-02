//fiind sum of the digits of given input number...?
package com.nit.sisu.lp;
import java.util.Scanner;
class Program5
{
	public static void main(String[] args) 
	{
		
		Scanner scn =  new Scanner(System.in);
		
		System.out.println("enter a number:");
		int num=scn.nextInt();
		int sum=0,rem=0;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("total digits of that that number is:"+sum);
		
	}
}
