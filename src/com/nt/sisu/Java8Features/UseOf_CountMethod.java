package com.nt.sisu.Java8Features;

import java.util.List;

public class UseOf_CountMethod {

	public static void main(String[] args) {
	
		List<Integer> totalCount = List.of(3,46,7,9,2,7,3);
		Long totalEvenCount = totalCount.stream().filter(i->i%2==0).count();
		System.out.println("totalEvenCount: "+totalEvenCount);
		System.out.println();
		
		
//==========================================================
	
	List<Integer> list = List.of(3,46,7,9,2,7,3);
	Long distinctTotal = list.stream().distinct().count();
	System.out.println("Total Distinct/Unique count:"+distinctTotal);

	}

}
