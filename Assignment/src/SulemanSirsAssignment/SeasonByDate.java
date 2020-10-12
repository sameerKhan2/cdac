package SulemanSirsAssignment;

import java.util.Scanner;

public class SeasonByDate {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the month");
		
		int month=sc.nextInt();
		
		System.out.println("enter the day");
		
		int day=sc.nextInt();
            String s=season(day,month);
            System.out.println(s);
	}
	
	
	public static String season(int d,int m)
	{
		if(d>=15 || d<=16)
		{
		if(m<=3 && m>=12)
		{
			//String s;
			return "Winter";
		}
		else
		{
			if(m>=3 && m<=6)
			{
				return "Spring";
			}
			
			else
			{
				if(m>=6 && m<=9)
				{
					return "Summer";
				}
				else
				{
					if(m>=9 && m<=12)
					{
						return "Fall";
					}
				}
			}
			
		}
		}
		return "nothing";
		
	}

}
