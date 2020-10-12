import java.util.Scanner;

public class PoweOfaNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number=sc.nextInt();
		
		System.out.println("Enter the power");
		int power=sc.nextInt();
		
		int k=1;
		
		for(int i=0;i<power;i++)
		{
			k=number *k;
			
		}
		
		System.out.println(k);
		sc.close();

	}

}
