package handson;

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		Runnable r1=()->{
			System.out.println("run method called");
		};
		Thread t1=new Thread(r1);
		t1.start();
	}
	

}
