/*
 * Name: Sam Conroy
 * Date: 10/20/2019
 * Course Number: CSC-220
 * Course Name: Data Structures
 * Problem Number: Homework 6
 * Email: srconroy0001@student.stcc.edu
 * Short Description of the Problem: This app looks for names between specified years 
 */

import java.util.Scanner;

public class NamesApp {
	final static String TITLE = "Names App";
	final static String CONTINUE_PROMPT = "Do this again? [y/N] ";
	
	//**********************************************
	
	
	//**********************************************
	
	private static void process(Scanner sc, String args[]) {
		
		int start = 0;
		int end = 0;
		int num = 0;
		
		do {
			System.out.println("Enter start year(Must be between 1880 and 2018): ");
			start = sc.nextInt();
			} while(start < 1880 || start > 2018);
		
		do {
		System.out.println("Enter end year(must be between 1880-2018 and bigger than the start year entered): ");
		end = sc.nextInt();
			} while((end < 1880 || end > 2018) && end >= start);
		
		do {
			System.out.println("Enter end year: ");
			num = sc.nextInt();
			} while(num > 0);
		
		System.out.println("Processing... ");
		sc.nextLine();  // Clear Keyboard
	}
	
	//**********************************************
	
	private static boolean doThisAgain(Scanner sc, String prompt) {
		System.out.print(prompt); 
		String doOver = sc.nextLine();
		return doOver.trim().equalsIgnoreCase("Y");
	}
	
	//**********************************************
	
	public static void main(String args[]) {
		System.out.println("Welcome to " + TITLE);
		Scanner sc = new Scanner(System.in);
		do {
			process(sc, args);
		} while (doThisAgain(sc, CONTINUE_PROMPT));
		sc.close();
		System.out.println("Thank you for using " + TITLE);
	}

}