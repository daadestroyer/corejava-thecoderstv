import java.util.Stack;

public class App5 {
	
	public static void main(String[] args) {
		Stack st = new Stack<>();
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		
		System.out.println(st);
		
		System.out.println(st.pop()); // LIFO
		System.out.println(st.pop()); 
		System.out.println(st.peek());
		
		System.out.println(st.size());
		System.out.println(st);
	}

}
