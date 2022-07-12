package ExceptionHandling;
import java.lang.*;
import java.util.Scanner;

class MinimumBalance extends RuntimeException{
	
	String msg;
	
	public MinimumBalance(String msg) {
		this.msg=msg;
	}
}

public class Withdraw {

	static double current_balance = 500;
	
	public static void main(String[] args)  throws MinimumBalance { 
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Withdraw Amount");
		int n=sc.nextInt();
		try {
			if(current_balance < n) {
				throw new MinimumBalance("Insuffient Amount Your Current_Bal is " +current_balance);
				
			}else {
				System.out.println("Please wait while your Transcation is Processing " +n);
				System.out.println("-------------------------------------");
			}
		}catch(MinimumBalance mb) {
			System.err.println("Insuffient Amount ");
		}
		
		

	}

}
