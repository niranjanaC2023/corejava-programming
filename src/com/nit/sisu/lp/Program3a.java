//Create and initialize an array with 7 integer number......and Search a number for an array using scanner object...
package com.nit.sisu.lp;
import java.util.Scanner;
class Program3a
{
	public static void main(String[] args) 
	{
		int arr[]={10,20,30,40,50,60,70};
		Scanner scn =  new Scanner(System.in);
		
		System.out.println("enter a number for searching:");
		int key=scn.nextInt();
		boolean found=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("element is found @location:"+i);
				found=true;
				break;
			}
		}
			if(!found)
				System.out.println("element is not found");
		
	}
}
