//find fibonnaci series of a number?
package com.nit.sisu.lp;
import java.util.Scanner;
class Program9
{
	public static void main(String[] args) 
	{
		
		Scanner scn =  new Scanner(System.in);
		
		System.out.println("enter a number:");
		int range = scn.nextInt();
		
		int a=0,b=1,c;
		for(int i=1;i<=range;i++)
		{
			System.out.print(a+"\t");
			c=a+b;
			a=b;
			b=c;
			
		}
		System.out.println();

		
		
		
	}
}