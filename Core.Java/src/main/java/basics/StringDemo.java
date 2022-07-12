package basics;

public class StringDemo {

	public static void main(String[] args) {
		String str = "abc";
		System.out.println(str);
		System.out.println(str.hashCode());
		
		char[]ch= {'a','b','c'};
		String str1 = new String(ch);
		System.out.println(str1);
		System.out.println(str1.hashCode());
		
		String str2 = new String("abc");
		System.out.println(str2);
		System.out.println(str2.hashCode());
		
		String str3 = str2+"def";
		System.out.println(str3);
		System.out.println(str3.hashCode());

	}

}
