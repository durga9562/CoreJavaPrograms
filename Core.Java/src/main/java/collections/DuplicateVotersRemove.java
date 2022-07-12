package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateVotersRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> ls = new ArrayList();
ls.add("amer");
ls.add("siri");
ls.add("vidya");
ls.add("neha");
ls.add("mani");
ls.add("satish");
ls.add("dinesh");
ls.add("ajju");
ls.add("amer");
ls.add("siri");

HashSet hs = new HashSet(ls);

System.out.println("Original voters:"+hs);
	}

}
