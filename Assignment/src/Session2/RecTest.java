package Session2;

import java.util.Scanner;

public class RecTest{

	public static void main(String[] args) {
		
		
		Rectangel r=new Rectangel();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter value of height and width");
	     r.height=sc.nextDouble();
	     r.width=sc.nextDouble();
		
		double area=r.area();
		
	
		
		System.out.println(area);
		sc.close();
	
	}

}
