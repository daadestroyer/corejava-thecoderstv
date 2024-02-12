import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

public class App13_Comparable {
	public static void main(String[] args) {
		// comparable meant for default natural sorting (ascending order)
		// to provide default natural sorting , things need to be comparable
		
		
		 // default natural sorting
		 TreeSet<Float> ts = new TreeSet<>();
		 ts.add(10.1F);
		 ts.add(1.1F);
		 ts.add(20.1F);
		 ts.add(3.1F);
		 ts.add(5.1F);
		 System.out.println(ts);
		 
		 // customized sorting
		 TreeSet<Float> ts1 = new TreeSet<>(Collections.reverseOrder());
		 ts1.add(10.1F);
		 ts1.add(1.1F);
		 ts1.add(20.1F);
		 ts1.add(3.1F);
		 ts1.add(5.1F);
		 System.out.println(ts1);
		 
		 System.out.println();
		 
		 // default natural sorting
		 TreeMap<Integer, String> tm = new TreeMap<>();
		 tm.put(101,"ABC");
		 tm.put(102,"ABE");
		 tm.put(105,"ABCD");
		 tm.put(103,"ABCDE");
		 System.out.println(tm);
		 
		 // customize sorting
		 TreeMap<Integer, String> tm1 = new TreeMap<>(Collections.reverseOrder());
		 tm1.put(101,"ABC");
		 tm1.put(102,"ABE");
		 tm1.put(105,"ABCD");
		 tm1.put(103,"ABCDE");
	 
		 System.out.println(tm1);
		 
		 
	}

}
