package Session5;

import java.util.Scanner;

public class AddMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[][] a1 = new int[2][2];

		int[][] a2 = new int[2][2];

		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a1.length; j++) {
				a1[i][j] = sc.nextInt();

			}
		}
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a1.length; j++) {
				a2[i][j] = sc.nextInt();

			}
		}
		
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a1.length; j++) {
				a2[i][j]+= a1[i][j];

			}
		}
		
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a1.length; j++) {

				System.out.print(a2[i][j]+" ");

			}
			System.out.println();
		}

		
		

	}

}
