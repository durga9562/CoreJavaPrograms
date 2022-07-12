package basics;

import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] words = input.split(" ");
		int word_count = 0;
		for(String word:words) {
			System.out.println(word);
			++word_count;
		}
		System.out.println("No of words="+word_count);

	}

}
