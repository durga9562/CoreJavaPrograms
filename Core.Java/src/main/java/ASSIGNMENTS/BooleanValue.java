package ASSIGNMENTS;

import java.util.Scanner;

public class BooleanValue {

	public static void main(String[] args) {
		boolean str1,str2,str3=false;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter 1st Boolean");
			str1=sc.nextBoolean();
			System.out.println("Enter 2nd Boolean");
			str2=sc.nextBoolean();
			System.out.println("Enter 3rd Boolean");
			str3=sc.nextBoolean();
			
			if(str1&&str2==true||str2&&str3==true||str3&&str1==true) {
				System.out.println("true");
			}
			else {
				System.out.println("false ");
			}
		}catch (Exception e) {

           System.out.println(" Error not a boolean value \n"+e.getMessage());
		}

	}

}
