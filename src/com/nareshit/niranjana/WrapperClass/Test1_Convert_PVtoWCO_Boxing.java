package com.nareshit.niranjana.WrapperClass;
public class Test1_Convert_PVtoWCO_Boxing {
	public static void main(String[] args) {
	//here we take 5 which is primitive value as "int" type So we take "Integer WC"
	//then convert
		Integer io1 = new Integer(5);
		Double do1 = new Double(10.5);
		Character co1 = new Character('a');
		Boolean bo1 = new Boolean(true);
		Long lo1 = new Long(5);
		Float fo1 = new Float(10.5); //its double
		Float fo2 = new Float(10.5F); 
		System.out.println(io1);
		System.out.println(do1);
		System.out.println(co1);
		System.out.println(bo1);
		System.out.println(lo1);
		System.out.println(fo1);
		System.out.println(fo2);
		
		//Byte b1 = new Byte(5);
		Byte bo2 = new Byte((byte)5); //using typeCasting
		System.out.println(bo2);
		
		byte b3 = 5;
		Byte bo3 = new Byte(b3);
		System.out.println(bo3); //using variable
		
		//Short so1 = new Short(5);
			Short  so2 = new Short((short)5); //using typeCasting
			System.out.println(so2);
	
			short s3 = 5;
			Short so3 = new Short(b3);
			System.out.println(so3); //using variable
}
}
