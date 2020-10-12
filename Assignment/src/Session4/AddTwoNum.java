package Session4;

import java.util.Scanner;

public class AddTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("enter first number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("enter second number ");
        int b=sc.nextInt();
        
        System.out.println("first way"+(a+b));
        
        System.out.println("second way"+add(a,b));
        
        int c=a+b;
        System.out.println("third way"+c);
        
        int arr[]=new int[2];
        arr[0]=a;
        arr[1]=b;
        
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
        	sum+=arr[i];
        	
        }
        System.out.println("fourth way "+sum);
        
        int  m=10;
        int n=20;
        int o=m+n;
        System.out.println("5th way static "+o);
	}
	
	public static int add(int a,int b )
	{
		return a+b;
	}

}
