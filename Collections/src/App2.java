import java.util.ArrayList;

public class App2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>(10);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		al.add(10);
		al.add(null);
		System.out.println(al);
		
		System.out.println(al.get(4));
		System.out.println(al.contains(100));
		System.out.println(al.remove(4));
		System.out.println(al);
		al.clear();
		System.out.println(al.isEmpty());
		
	}

}
