package Session4;

import java.util.Scanner;

public class ArmStrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter number");
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
	    
		long temp=n;
		long r,sum=0;
		
		while(temp!=0)
		{
			r=temp%10;
			temp=temp/10;
			sum+=(int)(Math.pow(r, 3));
			
			
		}
		
		if(n==sum)
		{
			System.out.println("armstrong num "+sum);
		}
		else
		{
			System.out.println("not armstrong "+sum);
		}

	}

}
