package FlowControls;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice");
	String color = sc.next();
	switch (color) {
	case "red": System.out.println("red");
	break;
	case "blue": System.out.println("blue");
	break;
	case "pink":System.out.println("pink");
	break;
	default:System.out.println("black");
	
	
	}

	}

}
