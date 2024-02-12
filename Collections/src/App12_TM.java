import java.util.Collections;
import java.util.TreeMap;



public class App12_TM {
	public static void main(String[] args) {
		
		// default natural sorting
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(101, "ram");
		tm.put(102, "laxman");
		tm.put(101, "bharath");
		System.out.println(tm);
		
		// customized sorting
		TreeMap<Integer, String> tm1 = new TreeMap<>(Collections.reverseOrder());
		tm1.put(101, "ram");
		tm1.put(102, "laxman");
		tm1.put(103, "bharath");
		System.out.println(tm1);
		
	}

}
