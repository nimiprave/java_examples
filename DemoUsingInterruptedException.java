package java_examples;

public class DemoUsingInterruptedException implements Runnable {

	public void run(){
		try {
			Worker();
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("The Worker method has been interrupted");
		}
	}
	
	public void Worker() throws InterruptedException{
		System.out.println("Worker method has started it execution");
		boolean running = true;
		while(!Thread.currentThread().isInterrupted()){
			System.out.println("Working hard in worker method");
		}
		System.out.println("I have been interrupted.. Hence exiting the method");
		throw new InterruptedException();
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hey.!... U are in main");
        DemoUsingInterruptedException tt = new DemoUsingInterruptedException();
        Thread t = new Thread(tt);
        t.start();
        try {
			Thread.sleep(10000);
			t.interrupt();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
        
	}

}
