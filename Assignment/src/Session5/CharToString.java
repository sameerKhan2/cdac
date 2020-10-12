package Session5;

import java.util.Scanner;

public class CharToString {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		
		char arr[]= {'s','a','m'};
		
		String s="";
		
		for(int i=0;i<arr.length;i++)
		{
			s=s+""+arr[i];
		}
		
		System.out.println(s);
	
	}

}
