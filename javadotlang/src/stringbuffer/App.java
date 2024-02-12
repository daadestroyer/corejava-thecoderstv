package stringbuffer;

public class App {
	public static void main(String[] args) {
		StringBuffer sBuffer = new StringBuffer();
		System.out.println(sBuffer.capacity());
		sBuffer.append("abcdefgh");
		System.out.println(sBuffer.capacity());
		System.out.println(sBuffer.toString());
		sBuffer.append("ijklmnopq");
		sBuffer.append("ijklmnopq");
		sBuffer.append("ijklmnopq");
		System.out.println(sBuffer.toString().length());
		System.out.println(sBuffer.capacity());
		
		
	}
}
