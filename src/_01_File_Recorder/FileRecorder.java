package _01_File_Recorder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileRecorder {
	static // Create a program that takes a message from the user and saves it to a file.
	Scanner scan = new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Name the file");
	String input = scan.next();
	System.out.println(input);
	
		try {
			FileWriter fw = new FileWriter("src/_00_Intro_To_File_Input_and_Output/test3.txt");
			
			/*
			NOTE: To append to a file that already exists, add true as a second parameter when calling the
			      FileWriter constructor.
			      (e.g. FileWriter fw = new FileWriter("src/_00_Intro_To_File_Input_and_Output/test2.txt", true);)
			*/
			
			fw.write(input);
				
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}

Copyright Roshan Sood 2021//Copyright Roshan Sood 2021