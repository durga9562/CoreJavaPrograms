package ASSIGNMENTS;

import java.util.Scanner;

public class OddRounder {

	public static void main(String[] args) {

		try { // problem statement
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			int number = sc.nextInt();
			sc.close();
			if (number == (int) number) {
				if (number > 0) {
					if (number % 2 == 0) {
						System.out.println("Entered number is even number and that number is : " + number);
					} else {
						int Multiple = number % 10;
						System.out.println("multiple is : " + Multiple * 10);
					}
				} else {
					System.out.println("Error");
				}
			}
		} catch (Exception e) { // error statement
			System.out.println("Error");
		}
	}
}
