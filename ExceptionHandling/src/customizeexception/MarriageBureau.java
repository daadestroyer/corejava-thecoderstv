package customizeexception;

import java.util.Scanner;

public class MarriageBureau {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you're age: ");
		int age = sc.nextInt();
		
		if(age < 18) {
			// you' re too young for marriage
			throw new TooEarlyToMarryException("you' re too young for marriage");
		}
		else if(age > 50) {
			// you're too old for marriage
			throw new TooLateToMarryException("you're too old for marriage");
		}
		else {
			// congrats you're eligible for marriage
			System.out.println("congrats you're eligible for marriage");
		}
	}
}
