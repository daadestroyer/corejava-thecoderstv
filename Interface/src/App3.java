interface i1 {

}

interface i2 {

}
interface i4{
	
}
interface i3 extends i1,i2,i4 {
	
	// interface can extends multiple interface at a time
}

class A {

}

class B {

}

class C extends A {
	// class can extends one class at a time
}

class D implements i1, i2 {
	// class can implements multiple interface at a time
}

public class App3 {

}
