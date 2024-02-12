import java.util.Arrays;

public class App1 {
	public static void main(String[] args) {
		// int
		int[] ar = {10,20};
		
		// float
		float[] ar1 = {10f,20F};
		
		// boolean
		boolean[] ar2 = {false,true};
		
		
		// above problem is arrays are homogenous
		
		// solution - object type array
		
		
		Object[] ob = new Object[4];
		ob[0] = 10;
		ob[1] = 'c';
		ob[2] = false;
		ob[3] = 10F;
		ob[4] = 10D;
		
		// hetrogeneous
		
		System.out.println(Arrays.toString(ob));
	}

}
