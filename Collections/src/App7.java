import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class App7 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(1);
		ts.add(9);
		ts.add(9);
		
		System.out.println(ts);
		// duplicates are not allowed
		// default natural sorting (asc order)
		
		TreeSet<Integer> ts1 = new TreeSet<>(Collections.reverseOrder());
		ts1.add(10);
		ts1.add(20);
		ts1.add(30);
		ts1.add(1);
		ts1.add(9);
		ts1.add(9);
		System.out.println(ts1);

	}
}
