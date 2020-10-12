package Session5;

import java.util.Scanner;

public class AverageOfArray {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int num;
		
		System.out.println("enter the number how many numbers average you want");
		
		num=s.nextInt();
		
		int arr[]=new int[num];
		
		//System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter number "+i);
			arr[i]=s.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			
		}
		
		
	 int avg=sum/arr.length;
	 
	 System.out.println("average is "+avg);
	}

}
