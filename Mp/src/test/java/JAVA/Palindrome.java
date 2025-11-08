package JAVA;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value");
		String input= sc.next();
		String rev="";
		
		for(int i=input.length()-1;i>=0;i--) {
			rev+=input.charAt(i);
		}
		
		if (input.equals(rev)) {
			System.out.println(input + " is Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
