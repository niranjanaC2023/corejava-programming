package com.nareshit.niranjana.WrapperClass;
public class Test1c_Object_pooling_Concept {
	public static void main(String[] args) {
		//valueOf(-) -->cache concept/Object pooling concept applied
		Byte bo1 =  Byte.valueOf((byte)5);
		Byte bo2 =  Byte.valueOf((byte)5);
		System.out.println(bo1==bo2);
		System.out.println();
		//valueOf(-) -->cache concept/Object pooling concept applied
		Short so1 =  Short.valueOf((short)5);
		Short so2 =  Short.valueOf((short)5);
		System.out.println(so1==so2);
		System.out.println();
		//valueOf(-) -->cache concept/Object pooling concept applied
		Integer io1 =  Integer.valueOf(5);
		Integer io2 = Integer.valueOf(5);
		System.out.println(io1==io2);
		System.out.println();
		//valueOf(-) -->cache concept/Object pooling concept applied
		Long lo1 = Long.valueOf(5);
		Long lo2 = Long.valueOf(5);
		System.out.println(lo1==lo2);
		System.out.println();
		
		//valueOf(-) -->cache concept/Object pooling concept not applied
		Float fo1 = Float.valueOf(5);//it is not 5, it is changed to 5.0 which is not byte range..so false
		Float fo2 = Float.valueOf(5);
		System.out.println(fo1==fo2);
		System.out.println();
		//valueOf(-) -->cache concept/Object pooling concept not applied
		Double do1 = Double.valueOf(5);//it is not 5, it is 5.0 which is not byte range..so false
		Double do2 = Double.valueOf(5);
		System.out.println(do1==do2);
		System.out.println();
		//valueOf(-) -->cache concept/Object pooling concept applied
		Character co1 = Character.valueOf('a');//'a' is the range of byte..so true
		Character co2 = Character.valueOf('a');
		System.out.println(co1==co2);
		System.out.println();
		//valueOf(-) -->cache concept/Object pooling concept applied
		Boolean boo1 = Boolean.valueOf(true);
		Boolean boo2 = Boolean.valueOf(true);
		System.out.println(boo1==boo2);
		System.out.println();
		//valueOf(-) -->cache concept/Object pooling concept not applied
		//because out of range of byte
		Integer io5 =  Integer.valueOf(150);
		Integer io6 =  Integer.valueOf(150);
		System.out.println(io5==io6);
		System.out.println();
		//valueOf(-) -->cache concept/Object pooling concept applied
		Byte bo3 =  Byte.valueOf((byte)150);
		Byte bo4=  Byte.valueOf((byte)150);
		System.out.println(bo3==bo4);
		System.out.println();
		//valueOf(-) -->cache concept/Object pooling concept not applied
		Short so3 =  Short.valueOf((short)150);
		Short so4=  Short.valueOf((short)150);
		System.out.println(so3==so4);
		System.out.println();
}
}
