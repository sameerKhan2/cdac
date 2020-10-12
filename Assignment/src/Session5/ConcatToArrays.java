package Session5;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatToArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.println("enter the number in first array");
		
		num=sc.nextInt();
		
		int arr[]=new int[num];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
System.out.println("enter the number in second array");
		
		num=sc.nextInt();
		
		int arr1[]=new int[num];
		
		for(int i=0;i<arr1.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int k=(arr1.length)+(arr.length);
		int arr3[]=new int[k];
		
		for(int i=0;i<arr.length;i++)
		{
			arr3[i]=arr[i];
		}
		
		System.out.println(Arrays.toString(arr3));
		
		for(int i=0,j=(arr.length-1)+1;i<arr1.length;i++,j++)
			
			{
			
			System.out.println("j"+j);
			
			
				
				arr3[j]=arr1[i];
				
			}
		
		
		System.out.println(Arrays.toString(arr3));

	}

}
