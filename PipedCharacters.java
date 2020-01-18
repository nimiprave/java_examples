package java_examples;

import java.io.*; 

public class PipedCharacters {
  
	public static void writeStuff(OutputStreamWriter rawOut){
		try{
			BufferedWriter out= new BufferedWriter(rawOut);
			String[][] line = {
					{"Java","has","nice","features"},
					{"Pipes","are","interesting"},
					{"Threads","are","fun","in","Java"},
					{"Don't","you","think","so?"}
					};
					
		   for(int i=0;i<line.length;i++){
			   String[] word = line[i];
			   	
			   for(int j=0;j<line.length;j++){
				   if( j > 0){
					   out.write(" ");
				   }
				   out.write(word[j]);
			   }
			   // mark the end of a line
			   out.newLine();
		   }
		   
		   out.flush();
		   out.close();
		}catch( Exception x ){
			x.printStackTrace();
		}
	}
}
