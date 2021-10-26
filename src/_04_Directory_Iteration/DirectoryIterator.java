package _04_Directory_Iteration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

public class DirectoryIterator {
	public static void main(String[] args) {
		/*
		 * The following is an example of how to list all of the files in a directory.
		 * Once the program is running, the directory is chosen using the JFileChooser.
		 */
		File src = new File("src");
		File[] file = src.listFiles();
		if (file != null) {
			for (File file2 : file) {
				File[] subfolder = file2.listFiles();
				if (subfolder != null) {
					for (File file4 : subfolder) {
						String filename = file4.getAbsolutePath();
						System.out.println(filename);
						if (filename.contains(".java")) {
							try {
								FileWriter fw = new FileWriter(filename, true);
								
								/*
								 * NOTE: To append to a file that already exists, add true as a second parameter
								 * when calling the FileWriter constructor. (e.g. FileWriter fw = new
								 * FileWriter("src/_00_Intro_To_File_Input_and_Output/test2.txt", true);)
								 */
								// subdirectory file.subfile
								fw.write("//Copyright Roshan Sood 2021");

								fw.close();
							} catch (IOException e) {
								e.printStackTrace();
							}
						
						}
					}
				}
			}
		}
		
		
}}

/*
 * Your task is to write a program that iterates through the src folder of this
 * current Java Project. For every .java file it finds, the program will add a
 * (non-legally binding) copyright statement at the bottom. Be aware of possible
 * directories inside of directories. (e.g //Copyright © 2019 FirstName
 * LastName)
 */
//Copyright Roshan Sood 2021