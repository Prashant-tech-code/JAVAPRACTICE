package myjava;

public class Highestfromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {100,12,22,122};
		int highest=a[0];
		
		for(int i =0; i<a.length;i++ ) {
			if(a[i]>highest) {
				highest=a[i];
			}
		}
		
		System.out.println(highest + ": is the highest no from array List");
	}

}
