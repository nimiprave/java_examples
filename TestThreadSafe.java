package java_examples;

public class TestThreadSafe implements Runnable {
 
	
	NotThreadSafe in;
	
	public TestThreadSafe(NotThreadSafe in){
		this.in = in;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           NotThreadSafe instance = new NotThreadSafe();
           new Thread(new TestThreadSafe(instance)).start();
           new Thread(new TestThreadSafe(instance)).start();
	}
	
	public void run(){
		in.add("Nirmal adding Text");
	}

}
