import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class App6 {
	public static void main(String[] args) {

		ArrayList<Integer> aList = new ArrayList<>();
		aList.add(100);
		aList.add(200);
		aList.add(300);

		System.out.println(aList);

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(300);

		// inserting order is not preserved 
		// duplicates are not allowed
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains(10));

	}
}
