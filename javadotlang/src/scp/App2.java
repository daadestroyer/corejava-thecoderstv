package scp;

public class App2 {
	public static void main(String[] args) {
		String s = new String("bhaskar");
		s = s.concat("software");
		String s1 = new String("bhaskarsoftware");
		System.out.println(s.equals(s1));

		String s2 = "bhaskar";
		String s3 = "software";
		String s4 = s2 + "" + s3;
		String s5 = s4;
		System.out.println(s4.equals(s5));
		System.out.println(s4 == s5);
	}

}
