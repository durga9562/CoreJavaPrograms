package Stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringStream {

	public static void main(String[] args) {
		// TODO Auto-generated method
		List<String> l = new ArrayList<String>();
		l.add("prasad");
		l.add("raghav");
		l.add("durga");

		System.out.println(l);

		List<String> name = l.stream().filter(n -> (n.equals("prasad"))).collect(Collectors.toList());
		System.out.println(name);

	}

}
