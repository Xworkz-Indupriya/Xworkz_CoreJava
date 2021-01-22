package com.xworkz.xworkzapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Email {

	public static void main(String[] args) {

		String emailid1 = "chenna.indupriya@gmail.com";
		String emailid2 = "chennaindupriya.xworkz@gmail.com";
		String emailid3 = "indupriyaece.rymec@gmail.com";
		String emailid4 = "indupriya.nbvc@gmail.com";
		String emailid5 = "indupriya.dhoni@gmail.com";
		String emailid6 = "cgvoindteja@gmail.com";
		String emailid7 = "cseena@gmail.com";
		String emailid8 = "clakshmi@gmail.com";
		String emailid9 = "cnag@gmail.com";
		String emailid10 = "cbalagovindappa@gmail.com";

		String emailid11 = "sush@gmail.com";
		String emailid12 = "sush.xworkz@gmail.com";
		String emailid13 = "sushece.rymec@gmail.com";
		String emailid14 = "indupriya.nbvc@gmail.com";
		String emailid15 = "indupriya.dhoni@gmail.com";
		String emailid16 = "rohit@gmail.com";
		String emailid17 = "puni@gmail.com";
		String emailid18 = "siddu@gmail.com";
		String emailid19 = "chinnu@gmail.com";
		String emailid20 = "cbalagovindappa@gmail.com";

		Collection<String> email = new ArrayList();
		email.add(emailid1);
		email.add(emailid2);
		email.add(emailid3);
		email.add(emailid4);
		email.add(emailid5);
		email.add(emailid6);
		email.add(emailid7);
		email.add(emailid8);
		email.add(emailid9);
		email.add(emailid10);

		email.add(emailid11);
		email.add(emailid12);
		email.add(emailid13);
		email.add(emailid14);
		email.add(emailid15);
		email.add(emailid16);
		email.add(emailid17);
		email.add(emailid18);
		email.add(emailid19);
		email.add(emailid20);
		System.out.println("List of mail id" + email);

		int totalElements = email.size();
		System.out.println("totalElements: " + totalElements);

		Iterator<String> iterator = email.iterator();
		while (iterator.hasNext()) {
			String emails = iterator.next();
			if (emails.equals("indupriya.dhoni@gmail.com")) {
				iterator.remove();
			}
		}
		System.out.println(email.size());

	}
}
