package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
			System.out.println("Welcome to a Converter where we concert meters to feet and reverse ");

			System.out.println("Enter Length");
			String strlength = input.nextLine();
			double length = Double.parseDouble(strlength);

	System.out.println("Is the measurement in (m)eter or (f)eet: ");
	String strUnitOfMeasurement = input.nextLine();

			if(strUnitOfMeasurement.equals("m")){
				System.out.println(length + "m is " + (length * 3.2808399) + "f");
			}
			else if (strUnitOfMeasurement.equals("f")){
				System.out.println(length + "f is " + (length * 0.3048) + "m");
			}
			else if(!strUnitOfMeasurement.equals("f") && !strUnitOfMeasurement.equals("m")) {
			System.out.println("ERROR: 404: invalid unit of measurement. Please use meter or feet.");
		}

	}

}
