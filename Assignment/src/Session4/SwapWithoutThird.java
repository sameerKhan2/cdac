package Session4;

import java.util.Scanner;

public class SwapWithoutThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("value of a");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("value of b");
		
		int b=sc.nextInt();
		
		swap(a,b);
		
		

	}
	
	public static void swap(int a,int b)
	{
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swaping value of a "+a);
		System.out.println("After swaping value of b "+b);
		
	}

}
