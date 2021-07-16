import java.util.Arrays;
import java.util.Scanner;

public class AnagramSolution {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String :");
		String str1=sc.nextLine();
		str1=str1.toLowerCase();
		System.out.println("Enter Second String :");
		String str2=sc.nextLine();
		str2=str2.toLowerCase();
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		boolean res=Arrays.equals(arr1, arr2);
		if(res==true)
			System.out.println("Strings are Anagram");
		else
			System.out.println("Strings are not Anagram");
		
	}

}
