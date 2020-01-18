package java_examples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFileSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("File to Read:   ");
		String fileName = sc.nextLine();
		System.out.println("File Read :   " + fileName);
		System.out.print("File to write:  ");
		String Writefile = sc.nextLine();
		System.out.println("Thank You");

		// This will reference one line at a time
		String line = null;

		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader = new FileReader(fileName);

			// FileWriter reads text files in the default encoding.
			FileWriter fileWriter = new FileWriter(Writefile);

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);

				bufferedWriter.write("&& |" + line + "|");
				bufferedWriter.newLine();
			}

			// Always close files.
			bufferedReader.close();
			bufferedWriter.close();

		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}

	}

}
