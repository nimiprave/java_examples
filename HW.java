package java_examples;

import java.util.Random;

public class HW {

	public static void main(String[] args) {

		int die1, die2, countdoubles = 0;
		Random rand = new Random();
		for( int i=0; i <100 ;i++){
			die1 = rand.nextInt(6) + 1;
			die2 = rand.nextInt(6) + 1;
			if(die1 == die2){
				countdoubles++;
			}
		}
		
			
		// TODO Auto-generated method stub
       System.out.println("I rolled " + countdoubles + " doubles");
       //showSomething();
       
	}
	
	public static void showSomething(){
		System.out.println("Called from show Something method");
	}

}
