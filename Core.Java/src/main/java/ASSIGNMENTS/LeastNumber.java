package ASSIGNMENTS;

import java.util.Scanner;

public class LeastNumber {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the frst number: ");
			int frstNumber = sc.nextInt();
			System.out.println("enter the second number: ");
			int secondNumber = sc.nextInt();

			if (frstNumber < secondNumber) {
				System.out.println("frst number is smaller");
			} else {
				System.out.println("second number is smaller");
			}
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

}
