package myjava;

import java.util.Scanner;

public class Highestno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value");
		a=sc.nextInt();
		System.out.println("Enter value");
		b=sc.nextInt();
		System.out.println("Enter value");
		c=sc.nextInt();
		
		if(a>b & a>c)
		{
			System.out.println("A is highest");
	}
		else if (b>a && b>c)
		{
			System.out.println("B is highest");
		}
		
		else {
			System.out.println("C is highest");
		}
	}
}
