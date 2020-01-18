package java_examples;

public class InterruptReset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Point X: Thread Interrupted()= " + Thread.interrupted());
        Thread.currentThread().interrupt();
        System.out.println("Before Interrupted() called= " + Thread.currentThread().isInterrupted());
        System.out.println("Point Y: Thread Interrupted()= " + Thread.interrupted());
        System.out.println("After Interrupted() called= " + Thread.currentThread().isInterrupted());
        System.out.println("Point Z: Thread Interrupted()= " + Thread.interrupted());
        System.out.println("Point J: Thread Interrupted()= " + Thread.interrupted());
	}

}
