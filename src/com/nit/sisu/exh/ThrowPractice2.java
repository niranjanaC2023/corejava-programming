package com.nit.sisu.exh;
class ThrowPractice2 
{
	public static void main(String[] args) 
	{
		//System.out.println(10/0);
		//throw new ArithmeticException("/byzero");
		//throw new IllegalArgumentException("do not pass negative number ");
		ArithmeticException ae = new ArithmeticException("/by zero ");
		throw ae;
	}
}
