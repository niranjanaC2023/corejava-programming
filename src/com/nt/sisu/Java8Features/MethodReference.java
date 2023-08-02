package com.nt.sisu.Java8Features;
public class MethodReference {

	public static void main(String[] args) {
		//==========================Method Reference=========================
		Cars carName = FavouriteMovie::moneyHeist;
		carName.maruti();
		//===========================Lambda Expression====================
		Cars carName1 = ()->
		{
			System.out.println("ok");
		};
		carName1.maruti();
		//==============================Annonymous Inner class========================
		
		Cars carName2 = new Cars()
				{
					@Override
					public void maruti()
					{
						System.out.println("done");
					}
				};
				carName2.maruti();
		
	}
}
