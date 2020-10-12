package PatternPrint;


public class DiamondPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j++) {
				System.out.println(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for (int l = 2; l <= i; l++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}

}
