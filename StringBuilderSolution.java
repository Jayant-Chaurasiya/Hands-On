package handson;

public class StringBuilderSolution {

	public static void main(String[] args) {

		String students[]= {"Rohan","Shyam","Rahul","Rishabh","Jainand","Priyanka","Pari","Parul","Pawan","Nikhil"};
		
		StringBuilder sb=new StringBuilder();
		for(String names:students)
		{
			sb.append(names+" ");
		}
		System.out.println(sb);
	}

}
