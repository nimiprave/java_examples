package java_examples;

public class ThreadLocalExample {
	public static class MyRunnable implements Runnable {
		private ThreadLocal<Integer> threadlocal = new ThreadLocal<Integer>();

		public void run() {
			threadlocal.set((int) (Math.random() * 100));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
			System.out.println(Thread.currentThread().getName() + threadlocal.get());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable sharedRunnableInstance = new MyRunnable();
		Thread t1 = new Thread(sharedRunnableInstance);
		Thread t2 = new Thread(sharedRunnableInstance);
		t1.setName("FirstThread");
		t2.setName("SecondThread");
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Main Thread Exiting");
	}

}
