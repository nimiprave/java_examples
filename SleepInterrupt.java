 package java_examples;

public class SleepInterrupt extends Thread {
    
	public void run(){
		
		System.out.println("You're Inside the Runnable thread : " + Thread.currentThread().getName());
		try {
			Thread.sleep(20000);   // Sleeping for Twenty Seconds
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Runnable Thread: I have been interrupted");
			System.out.println("Stepping out Bye Bye....");
			return;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            SleepInterrupt tt = new SleepInterrupt();
            tt.setName("Runnable Thread");
            tt.start();
            System.out.println("Main Thread: Going to sleep for two seconds");
            try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
            System.out.println("Interrupting the Runnable Thread: ");
            tt.interrupt();
            System.out.println("Exiting the main thread");
            
	}

}
