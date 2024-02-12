//package Type1;
//
//class Outer {
//	class Inner {
//		public void innerMethod() {
//			System.out.println("Inner Method");
//		}
//	}
//}
//
//public class Test2 {
//	public static void main(String[] args) {
//		// way - 1
//		Outer outer = new Outer();
//		Outer.Inner inner = outer.new Inner();
//		inner.innerMethod();
//		
//		// way - 2
//		new Outer().new Inner().innerMethod();
//	}
//}
