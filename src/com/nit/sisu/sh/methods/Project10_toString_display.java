package com.nit.sisu.sh.methods;
import java.util.Scanner;
class Project10_HashCode	
{
	public static void main(String[] args) 
	{
		Scanner bh = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter number");		
			String s1 = bh.nextLine();
			System.out.println("Enter Number:");
			String io = bh.nextLine();
			if(s1.hashCode() == io.hashCode())
			{
				System.out.println("both are same group");
			}
			else
			{
				System.out.println("both are difference");
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
