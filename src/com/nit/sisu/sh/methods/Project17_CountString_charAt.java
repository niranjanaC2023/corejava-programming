package com.nit.sisu.sh.methods;
import java.util.Scanner;
public class Project17_CountString_charAt			// class must be public
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter string");		
			String s1 = scn.nextLine();
			int count = 0;
			char ch=' ';
			int i,j;
			for(i=0;i<s1.length();)
			{
				ch=s1.charAt(i);
			}
			count=1;
			for(j=i+1;j<s1.length();j++)
			{
				if(ch==s1.charAt(j))
				{
					count++;
				}
			}
			s1=s1.replace(String.valueOf(ch)," ");
			if(ch==' ')
			{
			System.out.println("space is found"+count+"times");
			}
			else
			{
				System.out.println(ch+"is found"+count+"times");		
			}
		}
	}
}			






			/*if(name.isEmpty())
			{
				System.out.println("name can not be empty");
			
				elseif(name.isBlank())
				{
					System.out.println("name can not be space");
					
				}
			}
			else
			{
				try
				{
					Long.parseLong(name);
					System.out.prrintln(" number can not be a name");
				}
				catch (NumberFormatException e)
				{
					System.out.println("Hii"+name);
					System.out.println("you name has"+name.length()+"character");
				}
			}
			
		}
	}

}*/
