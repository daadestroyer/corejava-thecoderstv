import java.net.SocketTimeoutException;
import java.util.LinkedList;

public class App3 {
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addFirst(40);
		list.addFirst(60);
		
		
		
		
		System.out.println(list);
		
//		System.out.println(list.removeFirst());
//		System.out.println(list.removeLast());
//		System.out.println(list.remove(1));
//		
//		System.out.println(list);
		
		System.out.println(list.get(2));
	}
}
