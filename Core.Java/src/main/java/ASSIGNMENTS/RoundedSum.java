package ASSIGNMENTS;

import java.util.Scanner;

public class RoundedSum {

	// rounder sum based on condition of if right most digit is greater than equal
	// to 5 round with big
	// else round with small

	static int rounderSum(int no1, int no2, int no3) {
		int arr[] = { no1, no2, no3 };
		int sum = 0;
		if (no1 < 0 || no2 < 0 || no3 < 0) {
			System.out.println("Error: number might be negetive");
			System.exit(0);
		}
		for (int i = 0; i < 3; i++) {
			int rem = 0;
			while (arr[i] != 0) {
				rem = arr[i] % 10;
				arr[i] = arr[i] / 10;
			}
			if (rem >= 6)
				sum += (rem + 1) * 10;
			else
				sum += (rem - 1) * 10;
		}
		return sum;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("enter no1");
			int no1 = sc.nextInt();
			System.out.println("enter no2");
			int no2 = sc.nextInt();
			System.out.println("enter no3");
			int no3 = sc.nextInt();
			System.out.println("sum :" + rounderSum(no1, no2, no3));

		} catch (Exception e) {
			System.out.println(e.getMessage() + "  enter value not a number ");
		}

	}

}
