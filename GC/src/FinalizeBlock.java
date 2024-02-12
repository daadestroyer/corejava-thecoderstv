 
public class FinalizeBlock {
	public static void main(String[] args) {		
		FinalizeBlock t=new FinalizeBlock();
		
		System.gc();
		t.finalize(); // to call garbage collector
		
		t = null;
		
		
		
		
		System.out.println("End of main.");

		
	}
	public void finalize() {
		System.out.println("Test class finalize method got executed");
	}
}
