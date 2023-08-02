package com.nit.sisu.sh.methods;
import java.util.Scanner;
public class Project16_ReverseString
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter String");		
			String s1 = scn.nextLine();
			String res = ReverseString.reverse(s1);
			
			System.out.println("original"+s1);
			System.out.println("reverse"+s1);
			
		}
	}
}	
class ReverseString
{
		public static String reverse(String s1)
		{
			StringBuilder res = new StringBuilder();
			for(int i=s1.length()-1;i>0;i--)
			{
				res.append(s1.charAt(i));
			}
			return res.toString();
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
