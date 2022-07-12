//SumOfThe Digits sum 

package ASSIGNMENTS;

import java.util.Scanner;

public class SumOfTheDigits {

	public static void main(String[] args) {
		int number,remainder,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		number = sc.nextInt();
		remainder = number%10;
		sum=(remainder+(number/10));
		System.out.println("Sum Of The Digits is: "+sum);

	}

}
