package com.nt.sisu.Java8Features;

public class Perfessonal {

	public static void main(String[] args) 
	{
		Cars carName = new Cars()
				{
					@Override
					public void maruti()
					{
						System.out.println("BALENO");
					}
				};
				carName.maruti();
				
	//==================================
				Cars carName1 = ()->
												{
													System.out.println("BLUE-BALENO");
													};
													carName1.maruti();
	}

}
