import java.util.ArrayList;
import java.util.BitSet;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class App10_cursor {
	public static void main(String[] args) {
		// enumeration - applicable only for legacy classes
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		Enumeration<Integer> e = v.elements();
		while (e.hasMoreElements()) {
			System.out.print(e.nextElement() + " ");
		}
		System.out.println();

		// iterator
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();
		
		ListIterator<Integer> lstitr = al.listIterator();
		while(lstitr.hasNext()) {
			System.out.print(lstitr.next()+" ");
		}
		System.out.println();
		while(lstitr.hasPrevious()) {
			System.out.print(lstitr.previous()+" ");
		}
		// list iterator
	}
}
