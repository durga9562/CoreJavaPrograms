package basics;

import java.util.Scanner;

public class AraeOfTrianagle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("height ?");
		int height = sc.nextInt();
		System.out.println("breadth ?");
		int breadth = sc.nextInt();
		int Area = (height*breadth)/2;
		System.out.println("Area = "+(Area));

	}

}
