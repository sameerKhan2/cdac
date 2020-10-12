package Session5;

import java.util.Arrays;
import java.util.Scanner;

public class Concat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("size of first array");
		int a = sc.nextInt();

		int arr1[] = new int[a];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();

		}
		System.out.println("size of second array");
		int b = sc.nextInt();

		int arr2[] = new int[b];

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();

		}

		int arr3[] = new int[a + b];

		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}

		System.out.println(arr1.length);

		for (int i = 0, j = arr1.length; i < arr2.length; i++, j++) {
			arr3[j] = arr2[i];
		}
		System.out.println(Arrays.toString(arr3));

	}

}
