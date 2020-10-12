package ShakirSirsAssignment;

import java.util.Scanner;

public class salary {

	public static void main(String[] args) {
		
		System.out.println("enter the basic salary");
		
		Scanner sc=new Scanner(System.in);
		
		int b=sc.nextInt();
		
		int hra=(b/100)*40;
		
		int ma=1200;
		int ta=800;
		int pf=300;
		
		int sal=b+hra+ma+ta-pf;
		
		System.out.println("total salary"+sal);

	}

}
