package ASSIGNMENTS;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int n = sc.nextInt();
		if(n>0) {
			if(n%2==0) {
				System.out.println("EVEN");
			}else{
				System.out.println("ODD");
			}
		
			
		}
		}catch (Exception e){
			System.out.println("ERROR");
	}

}
}