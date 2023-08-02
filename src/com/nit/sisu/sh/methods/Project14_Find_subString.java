package com.nit.sisu.sh.methods;
import java.util.Scanner;
public class Project14_Find_subString			// class must be public
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter string");		
			String s1 = scn.nextLine().toLowerCase();
			
			if(s1.indexOf("hari")!=-1)
			{
				System.out.println("substring found");
			}
			else
			{
				System.out.println("substring not found");
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
