//Java String to Date Example
package com.nit.sisu.sh.methods;
import java.text.SimpleDateFormat;
import java.util.Date;  
public class Convert_StringToDate 
{  
	public static void main(String[] args)throws Exception 
	{  
    String s1="07/12/2021";  
    Date date=new SimpleDateFormat("dd/MM/yyyy").parse(s1);  
    System.out.println(s1+"\t"+date);  
	}  
}  












