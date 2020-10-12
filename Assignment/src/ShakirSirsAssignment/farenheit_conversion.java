package ShakirSirsAssignment;

import java.util.Scanner;

public class farenheit_conversion {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the tempreture in celsius");
		
		int c=sc.nextInt();
		
		int f=(c*9/5)+32;
		
		System.out.println("tempreture in Farenheit "+f);

	}

}
