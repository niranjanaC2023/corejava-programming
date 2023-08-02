package com.nareshit.niranjana.WrapperClass;
public class Test1a_Convert_PVtoWCO_Boxing_valueOf {
	public static void main(String[] args) {
	
		//here we take 5 which is primitive value as "int" type So we take "Integer WC"
	//then convert
		Integer io1 =  Integer.valueOf(5);
		Double do1 = Double.valueOf(10.5);
		Character co1 =  Character.valueOf('a');
		Boolean bo1 =  Boolean.valueOf(true);
		Long lo1 =  Long.valueOf(5);
		//Float fo1 =  Float.valueOf(10.5); //its double
		Float fo2 = Float.valueOf(10.5F); 
		System.out.println(io1);
		System.out.println(do1);
		System.out.println(co1);
		System.out.println(bo1);
		System.out.println(lo1);
		//System.out.println(fo1);
		System.out.println(fo2);
		
		//Byte b1 =  Byte.valueOf(5);
		Byte bo2 =Byte.valueOf((byte)5); //using typeCasting
		System.out.println(bo2);
		
		byte b3 = 5;
		Byte bo3 = Byte.valueOf(b3);
		System.out.println(bo3); //using variable
		
		//Short so1 =  Short.valueOf(5);
		Short  so2 = Short.valueOf((short)5); //using typeCasting
		System.out.println(so2);
	
		short s3 = 5;
		Short so3 =  Short.valueOf(b3);
		System.out.println(so3); //using variable
}
}
