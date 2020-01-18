package java_examples;

public class CubbyHole {
	private Object slot;
	public CubbyHole(){
		slot = null;
	}
	
	public synchronized void putIn(Object obj) throws InterruptedException{
		
		print("in PutIn  -- Entering");
		while(slot != null){
			print("in putIn() : slot is occupied about to wait() ");
			wait();
			print("in putIn() : notifed back from wait() ");
			
		}
		slot = obj;
		print("in putIn() : filled slot about to Notify() all");
		notifyAll();
		print("in putIn() : leaving after notify");		
		
	}
	
	private static void print(String msg){
		System.out.println(Thread.currentThread().getName() + ":" + msg);
	}
	
	
	public synchronized Object takeOut() throws InterruptedException{
		
		print("in takeOut() :  Entering");
		while(slot == null){
			print("in takeOut() :  Empty Slot .. Hence I gong to wait");
			wait();
			print("in takeOut() :  Done waiting... back from waiting");
		}
		Object obj =slot;
		slot = null;
		print("in takeOut() :  Emptied the Slot .. about to notifyAll()");
		notifyAll();
		print("in takeOut() -- leaving after notify");
		return obj;
	} 
	
}
