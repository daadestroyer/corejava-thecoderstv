import java.util.HashMap;
import java.util.Map;

public class App11_MAP {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(101, "Ram");
		hm.put(102, "Laxman");
		hm.put(103, "Bharath");

		hm.put(104, "Bharath");
		hm.put(null, "ABC");
		hm.put(null, "PQR");
		System.out.println(hm);

		// get
		System.out.println(hm.get(101));
		System.out.println(hm.get(102));

		// containsKey
		System.out.println(hm.containsKey(102));

		
		System.out.println();
		
		// iterate
		for (Map.Entry<Integer, String> obj : hm.entrySet()) {
			System.out.println(obj.getKey()+":"+obj.getValue());
		}

	}

}
