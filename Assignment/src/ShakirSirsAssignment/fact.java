package ShakirSirsAssignment;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int a=fact1(n);
		System.out.println("factorial of number " + n+" is "+a);

	}
	static int fact1(int n)
	{
		if(n==0)
			return 1;
		else
		return	(n*fact1(n-1));
	}

}
