import java.util.Scanner;

public class CompoundIntrest {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("please enter principal");
		double p=sc.nextDouble();
		
		System.out.println("please enter rate ");
		double r=sc.nextDouble();
		
		System.out.println("enter number of times intrest is compounded");
		
		int n=sc.nextInt();
		System.out.println("enter time");
		
		int t=sc.nextInt();
		
		
		double intrest=p*(Math.pow((1+r/100), (n*t))-p);
		
		System.out.println("C.I is"+intrest);
		sc.close();
	}

}
