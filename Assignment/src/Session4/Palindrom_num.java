package Session4;

import java.util.Scanner;

public class Palindrom_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number please");
		int p=sc.nextInt();
		
	boolean b=palindrom(p);
	
	if(b==true)
	{
		System.out.println("number is palindrom");
	}
	else
	{
		System.out.println("not a palindrom");
	}
		
	}
	
	public static boolean palindrom(int p)
	{
		int r,sum=0;
		int temp=p;
		while(p>0)
		{
			r=p%10;
			
			sum=(sum*10)+r;
			
			p=p/10;
			
		}
		if(temp==sum)
			return true;
		else
		return false;
	}

}
