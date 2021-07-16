import java.util.Scanner;

public class MultiDimensionalArray {

	public void takeInput(int[][] arr, Scanner sc, int size) {

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
	}

	public void sumOfMatrix(int[][] arr1, int[][] arr2, int size, int res[][]) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				res[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

	}

	public void output(int res[][], int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(res[i][j] + "  ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MultiDimensionalArray m = new MultiDimensionalArray();
		System.out.println("Enter the size of the Matrix");
		int size = sc.nextInt();
		int arr1[][] = new int[size][size];
		int arr2[][] = new int[size][size];
		int res[][] = new int[size][size];
		System.out.println("Enter the element of first matrix of size " + size + " * " + size);
		m.takeInput(arr1, sc, size);

		System.out.println("Enter the element of second matrix of size " + size + " * " + size);
		m.takeInput(arr2, sc, size);

		m.sumOfMatrix(arr1, arr2, size, res);
		m.output(res, size);

	}

}
