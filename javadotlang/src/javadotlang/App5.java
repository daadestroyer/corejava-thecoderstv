package javadotlang;

class Student {
	String name;
	int rollno;

	Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o instanceof Student) {
			Student s2 = (Student) o;
			if (name.equals(s2.name) && rollno == s2.rollno)
				return true;
			else
				return false;
		}
		return false;
	}
}

public class App5 {
	public static void main(String[] args) {
		String s1 = new String("ashok");
		String s2 = new String("ashok");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println();
		
		Student st1 = new Student("vijayabhaskar", 101);
		Student st2 = new Student("vijayabhaskar", 101);
		System.out.println(st1==st2);
		System.out.println(st1.equals(st2));
		
		
	}
}
