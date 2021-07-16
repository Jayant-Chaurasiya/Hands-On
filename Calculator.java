import java.util.Scanner;

public class Calculator {

	static int a, b,choice;
	static boolean cont;
	

	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int sub(int num1, int num2) {
		return ((num1 > num2) ? num1 - num2 : num2 - num1);
	}

	public static int mul(int num1, int num2) {
		return num1 * num2;
	}

	public static void div(int num1, int num2) {

		if (num1 > num2) {
			try {
				System.out.println(num1 / num2);
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		} else {

			try {
				System.out.println(num2 / num1);
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter first Number : ");
			a = sc.nextInt();
			System.out.println("Enter Secod Numbe :  ");
			b = sc.nextInt();
			System.out.println("enter 1 for add");
			System.out.println("enter 2 for subtract");
			System.out.println("enter 3 for multiply");
			System.out.println("enter 4 for divide");
			choice = sc.nextInt();
			
			
			
			switch (choice) {
			case 1: System.out.println(add(a,b));
				
				break;
				
			case 2: System.out.println(sub(a,b));
			
			break;
			
			case 3: System.out.println(mul(a,b));
			
			break;
			
			case 4: div(a,b);
			
			break;

			default:
				System.out.println("Wrong Choice");
				break;
			}
			System.out.println("press Y/N to continue or stop");
			cont=sc.nextBoolean();
			
		} while (cont==true);
		
		
		sc.close();
	}

}
