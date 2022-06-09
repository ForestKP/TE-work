package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {

		Scanner user = new Scanner(System.in);
		String desfile = user.nextLine();
		File newFile = new File(desfile);
		try {
			newFile.createNewFile();
		} catch (IOException e1) {

			e1.printStackTrace();
		}

		try (PrintWriter writer = new PrintWriter(desfile)) {

			int i = 1;

			while (i <= 300) {

				if (i % 3 == 0 && i % 5 == 0) {
					writer.println("FizzBuzz");

				}

				else if (i % 3 == 0) {
					writer.println("Fizz");
				}

				else if (i % 5 == 0) {
					writer.println("Buzz");
				} else {
					writer.println(i);
				}

				i++;
			}

			System.out.println("FizzBuzz.txt has been created.");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}