package com.nit.sisu.sh.methods;
import java.util.StringTokenizer;
class String_Object_Tokenizer		
{
	public static void main(String[] args) 
	{
		StringTokenizer st = new StringTokenizer("Hari NareshIT");new StringTokenizer("Hari NareshIT","a");new StringTokenizer("Hari NareshIT","a",true);
		System.out.println("number of the tokens:"+st.countTokens());
		while(st.hasMoreTokens())
		{
			String token = st.nextToken();
			System.out.println(token);
		}
		
	}
}

		
	

		