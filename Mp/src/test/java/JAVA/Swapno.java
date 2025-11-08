package JAVA;

import java.util.Scanner;

public class Swapno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st value");
		a=sc.nextInt();
		System.out.println("Enter 2nd value");
		b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping value of a is: " +a);
		System.out.println("After swapping value of b is: " +b);

	}

}
