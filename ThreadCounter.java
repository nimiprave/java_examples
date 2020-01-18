package java_examples;

public class ThreadCounter extends Thread{
     
	protected Counter counter = null;
	public ThreadCounter(Counter counter){
		this.counter = counter;
	}
	public void run(){
		for(int i=0;i<10;i++){
			counter.add(i);
			System.out.println(Thread.currentThread().getName() +  "-" + counter.getCounter());
		}
	}
	
	
}
