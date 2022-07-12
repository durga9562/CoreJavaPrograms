package ASSIGNMENTS;

import java.util.Scanner;

public class EvenFinder {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the number: ");
			int n = sc.nextInt();
			if (n % 2 == 0) {
				System.out.println("Even");
			} else {
				System.out.println("odd");
			}
		} catch (Exception e) {
			System.out.println("eRROR");
		}

	}

}
