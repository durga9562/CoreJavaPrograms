package ASSIGNMENTS;

import java.util.Scanner;

public class NaturalNumbers {

	static void printNO(int no) {
		for (int i = 1; i <= no; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to print");
		int no = sc.nextInt();
		printNO(no);
	}

}
