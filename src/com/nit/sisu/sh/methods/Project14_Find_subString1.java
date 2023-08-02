package com.nit.sisu.sh.methods;
import java.util.Scanner;
public class Project14_Find_subString1			// class must be public
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter string");		
			String s1 = scn.nextLine();
			String s2 = s1.toLowerCase();
			if(s2.contains("hari"))
			{
				int start=s2.indexOf("hari");
				int end=start+4;
				String hari=s1.substring(start,end);
				System.out.println("substring "+hari+" found");
			}
			else
			{
				System.out.println("substring hari not found");
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
