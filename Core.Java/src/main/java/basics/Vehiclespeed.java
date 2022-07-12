package basics;

import java.util.Scanner;

public class Vehiclespeed {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Area ?");
		int number1 = sc.nextInt();
		System.out.println("Enter the number2 ?");
		int number2 = sc.nextInt();
		int number3 = number1*number2;
		System.out.println("result = "+(number3));

	}

}
