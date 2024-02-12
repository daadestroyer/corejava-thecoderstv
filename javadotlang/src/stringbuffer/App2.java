package stringbuffer;

public class App2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		 
		System.out.println(sb.capacity()+":"+sb.length());
		sb.append("    abcdefghijklnopq       ");
//		System.out.println(sb.capacity()+":"+sb.length());
//		System.out.println(sb.toString());
//		sb.append("r");
//		System.out.println(sb.capacity()+":"+sb.length());
//		System.out.println(sb.charAt(0));
//		sb.setCharAt(0, 'Z');
//		System.out.println(sb);
//		sb.deleteCharAt(0);
//		System.out.println(sb);
//		
			
		System.out.println(sb.length());
		System.out.println(sb.toString().trim().length());
		System.out.println(sb.reverse().toString().trim());
		
	}
}
