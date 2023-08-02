package com.nareshit.niranjana.WrapperClass;
public class Test2_Convert_WCOtoPV_Unboxing {
	public static void main(String[] args) {
		Integer io1 = Integer.valueOf(5); //create WCO
		int i1 = io1.intValue();
		byte b1 = io1.byteValue();
		short s1 = io1.shortValue();
		long l1 = io1.longValue();
		float f1 = io1.floatValue();
		double d1 = io1.doubleValue();
		System.out.println(i1);
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println();
		Double do1 = Double.valueOf(10.5); //create WCO
		i1 = do1.intValue();
		b1 = do1.byteValue();
		s1 = do1.shortValue();
		l1 = do1.longValue();
		f1 = do1.floatValue();
	   d1 = do1.doubleValue();
	   System.out.println(i1);
	   System.out.println(b1);
	   System.out.println(s1);
	   System.out.println(l1);
	   System.out.println(f1);
	   System.out.println(d1);
	   System.out.println();
	   Integer io2 = Integer.valueOf(254); //create WCO
		 i1 = io2.intValue();
		 b1 = io2.byteValue();
		 s1 = io2.shortValue();
		 l1 = io2.longValue();
		 f1 = io2.floatValue();
		 d1 = io2.doubleValue();
		System.out.println(i1);
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println();
		//char c1 = io2.charValue(); //charValue() is not there
		//char c1 = io2.intValue();//can't convert int to char..need typecasting
		char c1 = (char)io2.intValue();
		System.out.println(c1);
		System.out.println();
		
		//boolean b2 = io2.booleanValue(); //booleanValue() is not there
		//boolean b2 = io2.intValue();//can't convert int to boolean..
		//boolean b2 = (boolean)io2.intValue(); //can't convert int to boolean
		//System.out.println(b2);
	}
}
