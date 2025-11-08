package myjava;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Value");
		boolean isprime=true;
		a=sc.nextInt();
		
		if(a<=1) {
			isprime=false;
		}
		
		else {
			for(int i=2;i<a;i++)
			{
				if(a%i==0) {
					isprime=false;
					break;
				}
			}
		}
		
		if(isprime) {
			System.out.println(a +": Given no is prime");
		}
		else {
			System.out.println(a+ ": Not a primeno");
		}
		
		

	}

}
