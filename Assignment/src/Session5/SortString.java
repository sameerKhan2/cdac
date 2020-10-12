package Session5;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
        
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter String to sort");
		
		String s=sc.next();
		
		char c[]=new char[s.length()];
		
		for(int i=0;i<s.length();i++)
		{
			c[i]=s.charAt(i);
			
		}
		
		Arrays.sort(c);
		
		System.out.println(Arrays.toString(c));
		
		System.out.println("or in other way");
		
		String k="";
		for(int i=0;i<c.length;i++)
		{
			k=k+""+c[i];
		}
		
		System.out.println(k);
		

	}

}
