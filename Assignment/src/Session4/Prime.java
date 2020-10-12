package Session4;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Prime from 1 to n");
		
		System.out.println("Please enter value of n ");
		
		Scanner sc=new Scanner(System.in);
		
		long n=sc.nextLong();
		
		
		
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			
			
		}
		

	}

}
