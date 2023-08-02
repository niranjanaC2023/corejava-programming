package com.nit.sisu.sh.methods;
import java.util.Scanner;
class Project12_Equals	
{
	public static void main(String[] args) 
	{
		Scanner bh = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter username");		
			String usn = bh.nextLine();
			System.out.println("Enter password:");
			String pwd = bh.nextLine();
			if(usn.equalsIgnoreCase("hk") && pwd.equals("nit"))
			{
				System.out.println("welcome to nit");
			}
			else
			{
				System.out.println("who r u???");
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
