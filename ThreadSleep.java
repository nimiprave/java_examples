package java_examples;

public class ThreadSleep extends Thread {
	
	public void run(){
		loop();
	}
	
    public void loop(){
    	Thread t = Thread.currentThread();
    	System.out.println("just entered loop: " + t.getName());
    	for(int i=0;i<10;i++){
    		try{
    			Thread.sleep(200);
    		}catch(InterruptedException e){
    			System.out.println(e.getMessage());
    		}
    		System.out.println("Name= " + t.getName());
    	}
    	System.out.println("About to leave loop() " + t.getName());
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Thread t = Thread.currentThread();
//		t.setName("Main Thread");
//         System.out.println("Main Thread: " + t.getName());
//         try{
//        	 Thread.sleep(5000);
//         }catch(Exception e){
//        	 System.out.println(e.getMessage());
//         }
//         System.out.println("After sleep Main Thread: " + t.getName());
		
		ThreadSleep tt = new ThreadSleep();
		tt.setName("My worker thread");
		tt.start();
		try{
			Thread.sleep(700);
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		tt.loop();
	}

}
