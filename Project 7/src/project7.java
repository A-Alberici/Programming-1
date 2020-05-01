// Albe Alberici
// Project 7
// April 30, 2020

import java.util.Scanner;
import java.io.*;

public class project7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Open input file from desktop
		File filename = new File("/Users/albae/Desktop/grades.txt");
		Scanner inputFile = new Scanner(filename);
		
		// Open file to write to
		FileWriter fw = new FileWriter("/Users/albae/Desktop/gradestotal.txt", true);
		PrintWriter outputFile = new PrintWriter(fw);
		
		// Create variables
		double totalGrades = 0.00;
		int totalNumber = 0;
		
		// Loop through the file
		while (inputFile.hasNext())
		{
			// Read data
			double tempGrade = inputFile.nextDouble();
			totalGrades += tempGrade;
			totalNumber++;
		}
		
		// Output data to file
		outputFile.println("Grade Statistics");
		outputFile.println("=============");
		outputFile.println("Total Points: " + totalGrades);
		outputFile.println("Number of Grades: " + totalNumber);
		outputFile.println("Average Grade: " + (totalGrades/totalNumber));
		
		// Close files
		inputFile.close();
		outputFile.close();
		
		
	}

}