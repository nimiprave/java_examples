package java_examples;

public class ThreadNameExample extends Thread {

	public void run(){
		for(int i =0;i<10;i++){
			printSomething();
		}
	}
	
	public void printSomething(){
		Thread t = Thread.currentThread();
	    System.out.println("Thread Name: " + t.getName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             new ThreadNameExample().start();
             new ThreadNameExample().start();
             
	}

}
