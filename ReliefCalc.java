/**
 * Disaster Relief Costs
 * 
 * This algorithm will calculate the total relief costs based on input disance and population
 * 
 * Anita Umana
 * 02/23/24
 * Cmsc 255 section 901
 * */

import java.util.Scanner;

public class ReliefCalc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String continueProgram = "yes";

		//Next Have to input a while to deterime cost
		while (continueProgram.equalsIgnoreCase("yes")) {
			//First have to create nextInt to determine the disance, cost and if ir transport is needed
			System.out.println("Enter the number of people needing relief: ");
			int p = scanner.nextInt();
			System.out.println("Enter the distance from headquarters: ");
			int d = scanner.nextInt();
			System.out.println("Is air transportation required?: ");
			String airTransportInp = scanner.next();
			boolean airTransport = airTransportInp.equalsIgnoreCase("yes");

			//Now you have to initialize the the Cost Labor and Land transit
			double supply = (1.0 / 5) * p;
			double labor = (1.0 / 5) * p;
			double landTransport = d * Math.sqrt(p);
			//Also initialze the total cost and create if statement if air transport is needed
			double total = 50000 + supply + labor + landTransport;
			if (airTransport) {
				total += total / 3;
			}
			//print total cost with printf 
			System.out.printf("Your relief effort will cost $%,.2f%n", total);

			//Now that we have calutlation, ask user if they want another estimate
			System.out.println("Would you like to create another disaster relief cost estimate? Enter yes to continue");
			scanner.nextLine();
			continueProgram = scanner.nextLine().trim();
		}
	}
}
