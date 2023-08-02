package com.nit.sisu.exh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Example3 
{
	public void m1()
	{
		 try
		 {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a;
			while(true)
			{
				try
				{
					System.out.println("\nEnter first number:");
					a = Integer.parseInt(br.readLine());
					break;
				}
				catch (NumberFormatException nfe)
				{
					System.out.println("enter only integer");
				}
			}
			while(true)
			{
				try
				{
					System.out.println("\nenter second number:");
					int b = Integer.parseInt(br.readLine());
					try
					{
						int c = a/b;
						System.out.println("result:"+c);
						break;
					}
					catch (ArithmeticException ae)
					{
						System.out.println("do not pass zero");
					}
				}
				catch (NumberFormatException nfe)
				{
					System.out.println("enter only integer");
				}
			
			catch(IOException ioe)
			{
			  ioe.printStackTrace();
		    }
		 }
		 }
		 catch(Exception io)
			{
				io.printStackTrace();
			}
	}
}

class Inner_Try_Catch_Project
{	
	public static void main(String[]args)
	{
		Example3 e1 = new Example3();
		e1.m1();
	}
}
