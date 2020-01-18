package java_examples;

public class TwoThread extends Thread {
//  
	public String name;
	public TwoThread(String s){
			this.name = s;
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(name);
		}
	}
}
