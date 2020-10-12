import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your choice");
		
		System.out.println("1. for addition of two number");
		System.out.println("2. for binary addtion");
		System.out.println("3. for char addtion ");
		System.out.println("4. to exit");
		int choice=sc.nextInt();
		
		
		
			switch (choice) {

			case 1:
                       System.out.println("enter first number");
                       
                       int a=sc.nextInt();
                       
                       System.out.println("enter second number");
                       
                       int b=sc.nextInt();
                       
                       System.out.println("sum is "+(a+b));
				break;

			case 2:
				
				
				
				System.out.println("enter first binary number ");
				String binary=sc.next();
				
				System.out.println("enter the second binary number");
				String binary1=sc.next();
				
				int a1=Integer.parseInt(binary,2);
				
				int b1=Integer.parseInt(binary1,2);
				
				int c=a1+b1;
				
				String addition=Integer.toBinaryString(c);
				
				System.out.println("addition of two binary number is  "+addition);
				break;

			case 3:
				
				System.out.println("enter the first char");
				char c1=sc.next().charAt(0);
				
				System.out.println("enter the second char");
				char c2=sc.next().charAt(1);
				
				int c3=c1+c2;
				
				char c4=(char)c3;
				
				System.out.println("char Addtion"+c4);
				break;
			
			case 4:
				System.exit(1);
				break;
				
			default:
				System.out.println("wrong choice");
			}
		
		sc.close();
		
		
		

	}

}
