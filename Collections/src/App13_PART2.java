import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;


class Student implements Comparable<Student>{
	int id;
	String name;
	
	public Student(int id,String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student s) {
//		return - this.name.compareTo(s.name);
		return  this.id - s.id;
	}
	
}
public class App13_PART2 {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Ram");
		Student s2 = new Student(102, "Laxman");
		Student s3 = new Student(103, "Bharath");
		Student s4 = new Student(104, "Shatrughan");
		
		TreeSet<Student> ts = new TreeSet<>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		
		 
		for(Student s : ts) {
			System.out.println(s);
		}
		
		
	}

}
