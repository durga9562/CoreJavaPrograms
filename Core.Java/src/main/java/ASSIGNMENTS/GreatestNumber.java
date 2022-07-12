package ASSIGNMENTS;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the frst number: ");
			int frstNumber = sc.nextInt();
			System.out.println("enter the second number: ");
			int secondNumber = sc.nextInt();

			if (frstNumber > secondNumber) {
				System.out.println("frst number is bigger");
			} else {
				System.out.println("second number is bigger");
			}
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

}
