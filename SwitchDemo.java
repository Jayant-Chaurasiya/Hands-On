

import java.util.*;

public class SwitchDemo {

	public static int yearCt(int year) {
		if (year > 1990 && year < 1995)
			return 1;
		else if (year >= 1995 && year < 2000)
			return 2;
		else if (year >= 2000 && year<2010)
			return 3;
		else if (year >= 2010 && year<2021)
			return 4;
		return 0;

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter Your date :");
		int day = s.nextInt();

		System.out.println("Enter Your month :");
		int month = s.nextInt();

		System.out.println("Enter Your year :");
		int year = s.nextInt();

		switch (yearCt(year)) {
		case 1:
			System.out.println("you are Early 90's born");
			break;
		case 2:
			System.out.println("you are late 90's born");
			break;
		case 3:
			System.out.println("you are new decade born");
			break;
		case 4:
			System.out.println("you are recently born");
			break;
		default:
			System.out.println("You are so old to be here for fun");
			break;
		}
	}

}
