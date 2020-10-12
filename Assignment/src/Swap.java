import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		System.out.println("Enter the first number");
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
		System.out.println("Enter the second number ");
		
		int b=sc.nextInt();
		
		int temp=0;
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swaping" );
		
		System.out.println("a="+a);
		
		System.out.println("b="+b);
		sc.close();

	}

}
