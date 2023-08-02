package com.nareshit.niranjana.WrapperClass;
public class Test3_Convert_PSOtoWCO {
	public static void main(String[] args) {
		//PSO-->WCO "5" -->5
	Integer io1 = new Integer("5");
	Integer io2 = new Integer("5");
	System.out.println(io1==io2);
	System.out.println();
	
	Integer io3 = Integer.valueOf("5");
	Integer io4 = Integer.valueOf("5");
	System.out.println(io3==io4);
	System.out.println();
	
	Integer io5 = Integer.valueOf("190");
	Integer io6 = Integer.valueOf("190");
	System.out.println(io5==io6);
	System.out.println();
	
	//Convert "10.5"-->10.5
	Double do1 = new Double("10.5");
	Double do2 =  Double.valueOf("10.5");
	System.out.println(do1==do2);
	System.out.println(do1);
	System.out.println(do2);
	System.out.println();
	
	//Convert "a"-->'a'
	//In character class, we do not have  "string" parameter constructor
	//we have "char" parameter constructor
	//Character co5 = new Character("a"); 
	Character co5 = new Character('a'); 
	System.out.println(co5);
	System.out.println();
	
	//Convert "true"-->true
	Boolean bo1 = new Boolean("true");
	Boolean bo2 = Boolean.valueOf("true");
	System.out.println(bo1==bo2);
	System.out.println(bo1);
	System.out.println(bo2);
	}
}
