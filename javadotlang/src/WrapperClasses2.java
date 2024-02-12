

public class WrapperClasses2 {
	public static void main(String[] args) {
		// valueOf() -- primitive -> wrapper object
		/*
		Integer I = Integer.valueOf(10);
		System.out.println(I);
		Character C = Character.valueOf('C');
		System.out.println(C);
		Float F = Float.valueOf(10f);
		System.out.println(F);
		*/
		
		// xxxValue() -- wrapper object -> primitive
		/*
		Integer i = new Integer(10);
		int i1 = i.intValue();
		System.out.println(i1);
		
		Character c = new Character('C');
		char ch = c.charValue();
		System.out.println(ch);
		
		Boolean b = new Boolean(false);
		boolean b1 = b.booleanValue();
		System.out.println(b1);
		*/
		
		// parseXXX() -- primitive -> string
		/*
		String s = "14101998";
		int i = Integer.parseInt(s);
		System.out.println(i);
		
		float f = Float.parseFloat(s);
		System.out.println(f);
		
		double d = Double.parseDouble(s);
		System.out.println(d);
		*/
		
		// toString() -- primitive -> string
		int i = 14101998;
		float f = 1410f;
		double d = 1212d;
		
		String pswd = Integer.toString(i);
		System.out.println(pswd);
		
		String num1 = Float.toString(f);
		System.out.println(num1);
		
		String num2 = Double.toString(d);
		System.out.println(num2);
	}
}
