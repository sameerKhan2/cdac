package ShakirSirsAssignment;



import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		
		
		
		System.out.println("Enter the numbers");
		
		
		int sum=0;
		for(int i=0; i < args.length;i++ )
		{
			sum=sum+Integer.parseInt(args[i]);
			
			
		}
		
		
		int avg=sum/args.length;
		
		System.out.println("Average="+avg);
		

	}

}
