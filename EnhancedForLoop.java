import java.util.*;

public class EnhancedForLoop {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Array Size");
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.printf("Result is : %d",sum(arr));
		
	}

	public static int sum(int arr[]) {
		int sum = 0;
		for (int item : arr) {
			sum += item;
		}
		return sum;
	}

}
