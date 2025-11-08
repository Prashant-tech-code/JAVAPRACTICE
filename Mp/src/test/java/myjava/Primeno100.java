package myjava;

import java.util.Scanner;

public class Primeno100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		for(int i=2;i<100;i++) {
			boolean isprime=true;
			for(int j=2;j<i;j++) {
				
				if(i%j==0) {
					isprime=false;
					break;
				}
			}
			
			if(isprime)
			{
				System.out.println("Prime no is: " +i);
			}
		}

	}

}
