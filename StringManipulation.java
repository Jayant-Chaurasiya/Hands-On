package handson;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str="The quick brown fox jumps over the lazy dog";
		System.out.println("The sentence is :"+str);
		System.out.println("Element at 12 th index :"+str.charAt(12));
		System.out.println("If 'is' present in this senetence : "+str.contains("is"));
		System.out.println(str.concat(" and killed it"));
		System.out.println("Check whether the sentence end with 'dogs' : "+str.endsWith("dogs"));
		System.out.println("Check whether the above sentence is equal to " +":The quick brown Fox jumps over the lazy Dog "+" ");
		System.out.println(str.equals("The quick brown Fox jumps over the lazy Dog"));

		System.out.println("Check whether the above sentence is equal to " +":THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG "+" ");
		System.out.println(str.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
		
		System.out.println(str.length());
		System.out.println(str.matches("The quick brown Fox jumps over the lazy Dog"));
		System.out.println(str.replace("The", "A"));
		String[] str1=str.split(" ");
		System.out.println("After splitting");
		for(String word:str1)
		{
			System.out.print(word+" ");
		}
		
		System.out.println();
		String animals[]= {"dog","fox"};
		System.out.print("Animals are : ");
		for(int i=0;i<str1.length;i++)
		{
			for(int j=0;j<animals.length;j++)
			{
				if(str1[i].equals(animals[j]))
				{
					System.out.print(str1[i]+" ");
				}
			}
		}
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.indexOf('a'));
		System.out.println(str.lastIndexOf('e'));
		
	}

}
