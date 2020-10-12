package Session2;

import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter radius");
		Scanner sc=new Scanner(System.in);
		
		
		double r=sc.nextDouble();
		
		Circle c=new Circle(r);
		
		System.out.println("circumference is"+c.cir());
		
		sc.close();

	}

}
