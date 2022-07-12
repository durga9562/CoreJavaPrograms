package Programs;

import java.util.Scanner;

public class BubbleSort {
	public void Bubblesort(int arr[]) {
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {
			
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1]=temp;
				
			}
		}
	}
	System.out.println("After sorting arr");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	}

	public static void main(String [] args) {
		
		BubbleSort bs=new BubbleSort();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array len");
		int len=sc.nextInt();
		
		int[] arr=new int[len];
		
		System.out.println("enter elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		bs.Bubblesort(arr);
		
		

	}

}
