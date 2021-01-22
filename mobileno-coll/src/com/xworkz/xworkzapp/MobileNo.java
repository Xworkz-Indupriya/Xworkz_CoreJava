package com.xworkz.xworkzapp;

import java.util.ArrayList;
import java.util.Collection;

public class MobileNo {

	public static void main(String[] args) {

		long mobileNo1 = 9880283396l;
		long mobileNo2 = 8549898499l;
		long mobileNo3 = 8431387655l;
		long mobileNo4 = 9880283353l;
		long mobileNo5 = 9880284566l;
		long mobileNo6 = 9880283343l;
		long mobileNo7 = 9876543396l;
		long mobileNo8 = 7896543213l;
		long mobileNo9 = 7877665590l;
		long mobileNo10 = 985236545l;

		Collection<Long> mobileNo = new ArrayList();
		mobileNo.add(mobileNo1);
		mobileNo.add(mobileNo2);
		mobileNo.add(mobileNo3);
		mobileNo.add(mobileNo4);
		mobileNo.add(mobileNo5);
		mobileNo.add(mobileNo6);
		mobileNo.add(mobileNo7);
		mobileNo.add(mobileNo8);
		mobileNo.add(mobileNo9);
		mobileNo.add(mobileNo10);
		System.out.println("mobile numbers:" + mobileNo);
		System.out.println("No of Mobile numbers: " + mobileNo.size());

		for (Long mobileNumber : mobileNo) {

			String convertedMobileNumber = mobileNumber.toString();
			Character last = convertedMobileNumber.charAt(convertedMobileNumber.length() - 1);
			System.out.println(last);
			if (Integer.parseInt(last.toString()) > 3) {
				System.out.println("mobile no is greater " + convertedMobileNumber);
			}
		}
	}
}
