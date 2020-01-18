package java_examples;

public class Counter {
	long count = 0;
	public synchronized void add(long value){
		this.count += value;
	}
	public synchronized void showCounter(){
		System.out.println("Counter: " + count);
	}
	public synchronized long getCounter(){
		return count;
	}
}
