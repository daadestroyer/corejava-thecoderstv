import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


public class App8_Q {
	public static void main(String[] args) {
		
		// default natural sorting
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(10);
		pq.add(2);
		pq.add(30);
		pq.add(4);
		pq.add(50);
		pq.add(1);
		pq.add(100);
		System.out.println(pq);
		
		
		// customized sorting
//		PriorityQueue<Integer> pq1 = new PriorityQueue<>(new Comparator<Integer>() {
//
//			public int compare(Integer o1, Integer o2) {
//				return o2 > o1 ? 1 : -1;
//			}
//		});
		
		PriorityQueue<Integer> pq1 = new PriorityQueue<>((i1,i2)->i1 > i2 ? -1 : 1);
		pq1.add(10);
		pq1.add(2);
		pq1.add(30);
		pq1.add(4);
		pq1.add(50);
		pq1.add(1);
		pq1.add(100);
		
		System.out.println(pq1);
	}
}
