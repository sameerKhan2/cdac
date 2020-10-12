package SulemanSirsAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class AppendArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of element in array 1");
		
		int a1=sc.nextInt();
	
		
		int a[]=new int[a1];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter number of element in second array 2");
		
		int b1=sc.nextInt();
		
		int b[]=new int[b1];
		
		
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		int arr[]=append(a,b);
		
		System.out.println("appended array is "+Arrays.toString(arr));
		
	

	}
	
	public static int[] append(int arr1[],int arr2[])
	{
		
		int size=arr1.length+arr2.length;
		
		int c[]=new int[size];
		
		for(int i=0;i<arr1.length;i++ )
		{
			c[i]=arr1[i];
		}
		
	
		for(int k=arr1.length,j=0;k<c.length;k++,j++)
		{
			c[k]=arr2[j];
		}
		
		return c;
		
	}

}
