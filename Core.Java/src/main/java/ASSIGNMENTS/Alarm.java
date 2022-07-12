package ASSIGNMENTS;

import java.util.Scanner;

public class Alarm {
	
	      static String    getAlarmStatus(int day, int vaccation){
	    	  
	    	  if(day<5&& vaccation==1)
	    	  return "10.00"+"vaccation and weekday";
	    	  else if(vaccation==1&&day>4)
	    		  return "off"+" weekend & vaccation";
	    	  else if(vaccation==0&&day<5)
	    		  return "07.00"+" office ";
	        	 
	    	  else 
	    		  return "10.00"+" weekend ";
	        	 
	         }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day 0 to 6 ");
		int day=sc.nextInt();
		System.out.println(" Enter 1 if vaccation enter 0 if not a vaccation  ");
		
		byte vaccation=sc.nextByte();
		System.out.println(getAlarmStatus(day, vaccation));
		
	}

}
