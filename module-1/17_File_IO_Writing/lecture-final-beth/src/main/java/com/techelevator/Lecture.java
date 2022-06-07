package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args)  {

		Scanner userInput = new Scanner(System.in);

		/*
		 * The java.io.File class is a representation of file and directory path names.  It provides methods to inspect and
		 * modify file system objects.
		 *
		 * One benefit is that it compensates for differences in Windows and Unix use of '/' and '\' as directory delimiters.
		 *
		 * A new instance of File can be created from a String that contains a file system path
		 */

		System.out.println("Enter the path of a file or directory");
		String path = "filesystem.txt";
		File f = new File(path);

		if(f.exists()) { //returns true if the file OR directory exists in the file system at the location specified
			System.out.println("name: " + f.getName());
			System.out.println("absolute path: " + f.getAbsolutePath());
			if(f.isDirectory()) {
				System.out.println("type: directory");
			}
			else if(f.isFile()) {
				System.out.println("type: file");
			}
			System.out.println("size: " + f.length());
		} else {
			System.out.println(f.getAbsolutePath() + " does not exist.");
		}


		//Create a directory
		System.out.println();
		System.out.println("Enter the path of the new directory: ");
		path = userInput.nextLine();
		File newDirectory = new File(path);

		if(newDirectory.exists()) {
			System.out.println("Directory " + path + " already exists.");
		} else {
			if(newDirectory.mkdir()) {
				System.out.println("New directory created at " + newDirectory.getAbsolutePath());
			} else {
				System.out.println("Could NOT create directory (oops)");
				System.exit(1);
			}
		}

		//Create a file
		System.out.println();
		System.out.println("Enter the name of the new file: ");
		String fileName = userInput.nextLine();
		File newFile = new File(newDirectory, fileName);

		try {
			newFile.createNewFile();
			System.out.println("name: " + newFile.getName());
			System.out.println("absolute path: " + newFile.getAbsolutePath());
			System.out.println("size: " + newFile.length());
		}
		catch (IOException e) {
			System.out.println("Could not create the file: " + newFile.getAbsolutePath());
			System.exit(1);
		}

		//Write to it
		System.out.println("Let's write something!");
		System.out.println("Tell me what to put in the file! ");
		String fileContents = userInput.nextLine();

		try( PrintWriter writer = new PrintWriter(newFile)) {
			writer.println(fileContents);
			for(int i = 0; i < 100; i++) {
				writer.println("something else");
				//writer.flush();
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("Could not open file for writing - file not found");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
