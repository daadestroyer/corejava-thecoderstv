package java.langseries;

class Student {
	private int sId;
	private String sName;
	private String sMob;
	
	public Student(int sId, String sName, String sMob) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sMob = sMob;
	}
	
	
}

public class Demo {
	public static void main(String[] args) {
		Student s1 = new Student(101,"Shubham Nigam","10001000900");
		System.out.println(s1);
	}
}
