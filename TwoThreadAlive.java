package java_examples;

public class TwoThreadAlive extends Thread {

	public void run() {

		for (int i = 0; i < 10; i++) {
			printMsg();
		}

	}

	public void printMsg() {
		Thread t = Thread.currentThread();
		System.out.println("Thread Name:  " + t.getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TwoThreadAlive tt = new TwoThreadAlive();
        tt.setName("My Worker Thread");
        System.out.println(" before start(), tt.isAlive=" +  tt.isAlive());
		tt.start();
		System.out.println(" just after start(), tt.isAlive=" +  tt.isAlive());
	    for(int i=0;i<10;i++){
	    	tt.printMsg();
	    }
	    System.out.println(" at the end of main(), tt.isAlive=" +  tt.isAlive());
	}

}
