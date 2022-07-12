package basics;

public class StringMethods {

	public static void main(String[] args) {
		String value = "Hyderabad";
		System.out.println(value.charAt(0));
		System.out.println(value.length());
		System.out.println(value.indexOf('d'));
		System.out.println(value.contains("bad"));
		System.out.println(value.substring(6,9));
		System.out.println(value.toUpperCase());
		System.out.println(value.toLowerCase());
		//System.out.println(value.typeOf());

	}

}
