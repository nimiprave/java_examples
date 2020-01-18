package java_examples;

public class CreatingUsingExtendThread extends Thread{
    
	public void run(){
		System.out.println("Initialied by extending the Thread:" );
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         CreatingUsingExtendThread t1 = new CreatingUsingExtendThread();
         t1.start();
         Runnable ThreadTest = new Runnable(){
     		public void run(){
     			System.out.println("Initialized by the RUnnable Object:" + Thread.currentThread().getName());
     		}
     	 };
         new Thread(ThreadTest, "RunnableThread").start();
         
	}

}
