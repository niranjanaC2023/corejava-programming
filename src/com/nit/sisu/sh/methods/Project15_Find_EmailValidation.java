package com.nit.sisu.sh.methods;
import java.util.Scanner;
public class Project15_Find_EmailValidation			// class must be public
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter Email");		
			String email = scn.nextLine();
			int atIndex;
//			if(atIndex=email.indexOf('@'))!=-1 && (email.indexOf('.',atIndex)!=-1)
//			{
//				System.out.println("Activation link sent ur mobile number");
//				System.out.println("Click link to complete regd");
//			}
//			else
//			{
//				System.out.println("invalid email");
//			}
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
