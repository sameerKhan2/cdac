package PatternPrint;


public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=5;i<=5;i++)
		{
			for(int j=4;j<=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=i+2;k<=i;k++)
			{
				System.out.println("*");
			}
			System.out.println();
		}

	}

}
