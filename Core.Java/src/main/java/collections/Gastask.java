package collections;

import java.util.ArrayList;

public class Gastask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Hp=new ArrayList();
		Hp.add("amer");
		Hp.add("mani");
		Hp.add("prasad");
		Hp.add("kumar");
		Hp.add("Harsha");
		Hp.add("mahesh");
		Hp.add("dinesh");
		Hp.add("satish");
		
		
		ArrayList<String> Indane = new ArrayList();
		Indane.add("hari");
		Indane.add("swadeep");
		Indane.add("sonerao");
		Indane.add("Madhu");
		Indane.add("nagaraju");
		Indane.add("naveen");
		Indane.add("rajesh");
		Indane.add("amer");
		Indane.add("mani");
		Indane.add("prasad");
		Indane.add("kumar");
		
		Hp.retainAll(Indane);
		System.out.println("Both company customers:"+Hp);
		
		

	}

}
