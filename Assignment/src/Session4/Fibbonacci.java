package Session4;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter n");
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int a=0;
		int b=1;
		int c=0;
		
		System.out.print(a+" "+b+" ");
		
		for(int i=2;i<n;i++)
		{
			c=a+b;
			
			System.out.print(c+" ");
			
			a=b;
			b=c;
			
		}
		

	}

}
