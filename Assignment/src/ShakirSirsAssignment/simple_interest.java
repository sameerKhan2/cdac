package ShakirSirsAssignment;

import java.util.Scanner;

public class simple_interest {

	public static void main(String[] args) {
	

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Principal");
		
		float p=sc.nextInt();
		
		System.out.println("Enter rate");
		float r=sc.nextInt();
		
		System.out.println("Enter Years");
		
		float y=sc.nextInt();
		
		float si=(p*r*y)/100;
		
		System.out.println("SI is "+si);
	}

}
