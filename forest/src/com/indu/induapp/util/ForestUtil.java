package com.indu.induapp.util;

import com.indu.induapp.forest.NalaMalaForest;

public class ForestUtil {

	public static void main(String[] args) {
		
		NalaMalaForest nalaforest= new NalaMalaForest("Srisilam",200);
		/*nalaforest.setAddress("Kurnool");
		nalaforest.setAcres(200);
		*/
		System.out.println(nalaforest.getAddress() + " " + nalaforest.getAcres());
		
	}
}
