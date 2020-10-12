package Session2;

import java.util.Scanner;

public class AsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the char");
		
		char c=sc.next().charAt(0);
		
		int a=(int)c;
		System.out.println("Ascii value od char "+c+" "+a);
		
		sc.close();

	}

}
