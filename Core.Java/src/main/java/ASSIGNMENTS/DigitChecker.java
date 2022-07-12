package ASSIGNMENTS;

import java.util.Scanner;

public class DigitChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int number,number2,remainder,diff;
number = sc.nextInt();
remainder = number%10;
number2 = number/10;
diff=(remainder-number2);
System.out.println("The digit difference is: "+diff);
	}

}
