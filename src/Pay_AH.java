/**
 * This program calculates the user’s gross pay including overtime if applicable.
 * Student:	    Antonyo Hutsona
 * Student-ID:	36225268
 * Class        CIS163AA
 * Assignment:	Chapter 2 Assignment 1 task # 1 & 2
 */

import java.text.DecimalFormat;														// For DecimalFormat class
import java.util.Scanner;  															// For the Scanner class

public class Pay_AH {
	public static void main(String[] args) {

		// Scanner object to read input.
		Scanner keyboard = new Scanner(System.in);

		// Get the number of hours worked this week.
		System.out.print("How many hours did you work? ");
		double inputHours = keyboard.nextInt();                                     // Hours worked from keyboard input

		// Get the user's hourly pay rate.
		System.out.print("How much are you paid per hour? ");
		double inputPayRate = keyboard.nextDouble();                                // Hourly pay rate from keyboard

		// Calculations object, calc. gross pay
		Calculations earnings = new Calculations();

		// Get pay
		earnings.setRate(inputPayRate);
		earnings.setHours(inputHours);
		double grossPay = earnings.getCalculations();

		// DecimalFormat object, covert to currency format
		DecimalFormat dollar = new DecimalFormat("$#,##0.00");

		// Display the resulting information.
		System.out.println("You earned " + dollar.format(grossPay));
	}

/**
 * Task #2 Compile and Execute a Program
 *
 * This program compiles successfully with no
 * errors for number values greater-than or equal to 0
 */
}