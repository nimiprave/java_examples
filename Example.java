package java_examples;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = new Counter();
		Thread t1 = new ThreadCounter(counter);
		t1.setName("Nirmal");
		Thread t2 = new ThreadCounter(counter);
		t2.setName("Shyam");
		t1.start();
		t2.start();
		boolean alive = true;
		while (alive) {
			if (!t1.isAlive() && !t2.isAlive()) {
				alive = false;
				counter.showCounter();
			}
		}
	}
}
