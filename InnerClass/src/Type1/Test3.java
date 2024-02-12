//package Type1;
//
//class Outer {
//
//	int a = 10;
//	static int b = 20;
//	private int c = 30;
//
//	class Inner {
//		int a = 100;
//		static int b = 200;
//		private int c = 300;
//		
//		public void accessData() {
//			System.out.println("a = " + a); // 100
//			System.out.println("b = " + b); // 200
//			System.out.println("c = " + c); // 300
//			
//			System.out.println(Outer.this.a); // 10
//			System.out.println(Outer.b); // 20
//			System.out.println(Outer.this.c); // 30
//		}
//	}
//}
//
//public class Test3 {
//	public static void main(String[] args) {
//		new Outer().new Inner().accessData();
//	}
//}
