import java.util.*;

public class IfDemo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter first Number :");
		int first = s.nextInt();

		System.out.println("Enter second Number :");
		int second = s.nextInt();

		System.out.println("Enter third Number :");
		int third = s.nextInt();

		System.out.println((first > second) ? ((first > third) ? first : third) : ((second > third) ? second : third));

	}

}
