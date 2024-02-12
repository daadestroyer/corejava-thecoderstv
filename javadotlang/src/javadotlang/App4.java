package javadotlang;

import java.util.Objects;

class Employee {
	int eid;
	String ename;

	public Employee(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) // e1 == e2
			return true;
		if (obj == null) // e2 == null
			return false;
		if (this.getClass() != obj.getClass()) // e1.getClass() != e2.getClass()
			return false;
		Employee other = (Employee) obj;
		return eid == other.eid && Objects.equals(ename, other.ename);
	}
 
	
	
	

}

public class App4 {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "ram");
		Employee e2 = new Employee(101, "ram");
		
		System.out.println(e1.equals(e2));
		System.out.println(e1==e2);

	}
}
