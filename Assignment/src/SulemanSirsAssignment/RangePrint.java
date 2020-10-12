package SulemanSirsAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class RangePrint {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
		int b=sc.nextInt();
		
		int arr[]=range(a,b);
		
		System.out.println(Arrays.toString(arr));

	}
	public static int[] cal(int a, int b,int size)
	{
		int arr[]=new int[size+1];
		for(int i=a,j=0;i<=b;i++,j++ )
		{
			arr[j]=i;
		}
		
		return arr;
		
	}
	
	public static int[] range(int a,int b)
	{
		
		int size=0;
		if(a>b)
		{
			size=a-b;
			
			int arr[]=cal(b,a,size);
			return arr;
		}
		else
		{
			if(b>a)
			{
				 size=b-a;
					
					int arr[]=cal(a,b,size);
					return arr;
				 
			}
			else
			{
				if(a==b)
				{
					System.out.println("only one element");
				}
			}
		}
		
		return null;
	}
		
	
		
	}
	
	
	


