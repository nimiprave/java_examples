package java_examples;

public class DemoMultipleWaitNotify {

	
	
		public static Object lockObject = new Object();
		public static boolean value = false;
		
		public static void main(String[] args) {

		//	Object lockObject = new Object();
		//	Boolean  value = new Boolean("false");
			
			// Runnable for waiting
			Runnable waitRunnable = new Runnable() {
				@Override
				public void run() {
					synchronized (lockObject) {

						while (!value) {
							
							try {
							    System.out.println(Thread.currentThread().getName() + ": I am about to Wait");
								lockObject.wait();
								
							} catch (InterruptedException e) {
								System.out.println("I have been interrupted from Wait");
							}
						}
						System.out.println(
								Thread.currentThread().getName() + "Value : " + value + " : I am done waiting..Out now");

					}

				}
			};
			// Runnable for Notifying
			Runnable notifyRunnable = new Runnable() {
				@Override
				public void run() {
					synchronized (lockObject) {
	                    value = true;
						lockObject.notifyAll();
						System.out.println(Thread.currentThread().getName() + ":I have notified");

					}

				}
			};
			
			// create threads and execute accordingly. 
			
			Thread waitThread1 = new Thread(waitRunnable);
			waitThread1.setName("Wait Thread-1");
			
			Thread waitThread2 = new Thread(waitRunnable);
			waitThread2.setName("Wait Thread-2");
			
			Thread waitThread3 = new Thread(waitRunnable);
			waitThread3.setName("Wait Thread-3");
			
			
			Thread notifyThread = new Thread(notifyRunnable);
			notifyThread.setName("Notify Thread");
			
			waitThread1.start();
			waitThread2.start();
			waitThread3.start();
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println("interrupted from sleep in main thread");
			}
			notifyThread.start();

		}

	}

	
	
	
	
	
	
	
	
	
	
	

