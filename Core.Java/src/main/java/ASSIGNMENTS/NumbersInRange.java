package ASSIGNMENTS;

import java.util.Scanner;

public class NumbersInRange {

	static void printNO(int start, int end) {
		for (int i = start; i <= end; i++) {
			for (int j = start; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.println();
			System.out.println(i+" ");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("enter start");
			int start = sc.nextInt();
			System.out.println("enter end ");
			int end = sc.nextInt();
			if(start>=end) {
				System.out.println(" start must be smaller than end ");
				System.exit(0);
			}
            printNO(start, end);
		} catch (Exception e) {
			System.out.println("Error" + e.getMessage());
		}

	}

}
