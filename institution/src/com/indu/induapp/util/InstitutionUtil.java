package com.indu.induapp.util;


//import com.indu.induapp.institution.BMSInstitute;
//import com.indu.induapp.institution.Institution;
import com.indu.induapp.institution.RNSInstitute;

public class InstitutionUtil {

	public static void main(String[] args) {
		
		//Institution institute= new Institution();
		RNSInstitute institute= new RNSInstitute("","");
		institute.setAddress("Jayanagar");
		institute.setCourses("BTECH,BCA");
		System.out.println(institute.getAddress() + " " + institute.getCourses());
		
		
		/*BMSInstitute institute = new BMSInstitute("Rajajinagar","BA");
		System.out.println(institute.getAddress() + " " + institute.getCourses());
		*/
		
	}
}
