package java_examples;

public class TestEarlyNotify {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		EarlyNotify list = new EarlyNotify();

		// Remove Runnable
		Runnable removeRunnable = new Runnable() {
			public void run() {
				try {
					System.out.println("Removed the Item: " + list.removeItem());
				
				} catch (InterruptedException e) {
					System.out.println("Interrupted from the wait:/" + e.getStackTrace());
				}

			}
		};
		
		// Add Item Runnable
		Runnable addRunnable = new Runnable(){
			
			public void run(){
				try{
					
					list.addItem("Nirmal");
										
				}catch(Exception e){
					System.out.println("Exception while adding an item" + e.getMessage() );
				}	
			}
						
		};
		try {
			Thread t1 = new Thread(removeRunnable, "RemoveThread_1");
			t1.start();
			Thread.sleep(500);
			Thread t2 = new Thread(removeRunnable, "RemoveThread_2");
			t2.start();
			Thread.sleep(500);
			Thread t3 = new Thread(addRunnable, "RemoveThread_3");
			t3.start();
			Thread.sleep(1000);
			t1.interrupt();
			t2.interrupt();
		
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		

	}

}
