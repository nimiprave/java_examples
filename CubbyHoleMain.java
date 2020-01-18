package java_examples;

public class CubbyHoleMain {

	
	private static void print(String msg){
		System.out.println(Thread.currentThread().getName() + ":" + msg);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final CubbyHole ch = new CubbyHole();
	
		Runnable runA = new Runnable(){
			public void run(){
				try {
					String str;
					Thread.sleep(1000);
					str = "multithreaded";
					ch.putIn(str);
					print("in run() : -- just put in : " + str + "'");
                    
					str = "programming";
					ch.putIn(str);
					print("in run() : -- just put in : " + str + "'");
                    
					str = "with Java";
					ch.putIn(str);
					print("in run() : -- just put in : " + str + "'");
                    
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		};
		
	Runnable runB = new Runnable(){
		public void run(){
			try {
				Object obj;
				obj = ch.takeOut();
				print("in run() : -- just took out: " + obj + "'");
				
				Thread.sleep(500);
				
				obj = ch.takeOut();
				print("in run() : -- just took out: " + obj + "'");
				
				obj = ch.takeOut();
				print("in run() : -- just took out: " + obj + "'");
				
				
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	};	
	
	Thread threadA = new Thread(runA, "threadA");
	threadA.start();
	
	Thread threadB = new Thread(runB, "threadB");
	threadB.start();
	
	}

}
