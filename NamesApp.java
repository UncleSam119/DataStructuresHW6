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

public class TemplateForProjects2 {
	final static String TITLE = "Names App";
	final static String CONTINUE_PROMPT = "Do this again? [y/N] ";
	
	//**********************************************
	
	
	//**********************************************
	
	private static void process(Scanner sc, String args[]) {
		
		int start;
		int end;
		int num;
		
		System.out.print("Enter start year: ");
		start = sc.nextInt();
		System.out.println("Enter end year: ");
		end = sc.nextInt();
		System.out.print("Enter number of names: ");
		num = sc.nextInt();
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