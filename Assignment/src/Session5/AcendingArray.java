package Session5;

import java.util.Arrays;
import java.util.Scanner;

public class AcendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.println("enter the number how many numbers you want");
		
		num=sc.nextInt();
		
		int arr[]=new int[num];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
