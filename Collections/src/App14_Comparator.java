import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Laptop  implements Comparable<Laptop>{

	int id;
	String name;
	int price;

	public Laptop(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Laptop laptop) {
		return this.id - laptop.id;
	}
}

public class App14_Comparator {
	public static void main(String[] args) {
		ArrayList<Laptop> al = new ArrayList<>();

		Laptop l1 = new Laptop(101, "Dell", 35000);
		Laptop l2 = new Laptop(102, "Lenovo", 48000);
		Laptop l3 = new Laptop(103, "HP", 45000);
		Laptop l4 = new Laptop(104, "Apple", 135000);
		al.add(l1);
		al.add(l2);
		al.add(l3);
		al.add(l4);
		
		Collections.sort(al,new Comparator<Laptop>() {

			@Override
			public int compare(Laptop o1, Laptop o2) {
				return o1.name.compareTo(o2.name);
			}
			
		});
		
		for(Laptop laptop : al) {
			System.out.println(laptop);
		}
		System.gc();
		
		Runtime r = Runtime.getRuntime();
		r.freeMemory();
		r.totalMemory();
		r.gc();
		
		Runtime.getRuntime().gc();
		
	}
}
