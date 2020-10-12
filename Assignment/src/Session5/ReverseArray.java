package Session5;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.println("enter the number you want in array");
		
		num=sc.nextInt();
		
		int arr[]=new int[num];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter number ");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Now you can see reverse of your array");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		//Actual array reverse
		int temp=0;
		int n=arr.length;
		for(int i=0;i<n/2;i++)
		{
			temp=arr[i];
			
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
			
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		sc.close();

	}

}
