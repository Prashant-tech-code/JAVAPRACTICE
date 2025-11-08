package JAVA;

import java.util.Scanner;

public class ODDEVEN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		a=sc.nextInt();
		
		if(a%2==0) {
			System.out.println("Even No");
		}
		else {
			System.out.println("Odd no");
		}
		
	}

}
