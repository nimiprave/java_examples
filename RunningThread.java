package java_examples;

public class RunningThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          TwoThread tt = new TwoThread("First Thread");
          TwoThread t1 = new TwoThread("Second Thread");
          try{
        	  tt.start();
        	  t1.start();
          }catch(Exception e){
        	  System.out.println(e.getMessage());
          }
	}

}
