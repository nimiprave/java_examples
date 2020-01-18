package java_examples;

public class ImplementsRunnable implements Runnable{

	
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args){
	    new Thread(new ImplementsRunnable()).start();
	}
}
