package FlowControls;

import java.util.Scanner;

public class SwitchWithCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter (A,B,C AND D ONLY");
		char choice = sc.next().charAt(0);
		switch (choice) {
		case 'A':System.out.println("APPLE");
		case 'B':System.out.println("BALL");
		case 'C':System.out.println("CAT");
		break;
		case 'D':System.out.println("DOG");
		}

	}

}
