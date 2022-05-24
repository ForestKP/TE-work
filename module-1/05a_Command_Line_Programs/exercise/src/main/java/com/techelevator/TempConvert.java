package com.techelevator;
import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the temperature: ");
		int temp = input.nextInt();
		input.nextLine();

		System.out.println("Is the temperature in (C)elcius or (F)arenheit? ");

		String scale = input.nextLine();

		if (scale.equals("C")) {
			//Tf = (Tc * 1.8) + 32
			int tempInF = (int)((temp * 1.8) + 32);
			System.out.println(temp + "C is " + tempInF + "F.");

		} else if (scale.equals("F")){
			//Tc = (Tf - 32) / 1.8
			int tempInC = (int)((temp - 32) / 1.8);
			System.out.println(temp + "F is " + tempInC + "C.");
		}

	}

}








