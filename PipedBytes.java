package java_examples;

import java.io.*;
import java.util.Arrays;

public class PipedBytes {

	public static void writeStuff(OutputStream rawOut) {
		try {
			DataOutputStream out = new DataOutputStream(new BufferedOutputStream(rawOut));
			int[] data = { 82, 86, 83, 25, 26, 27, 28, 29, 23, 100, 101, 105 };
			Arrays.sort(data);
			for (int i = 0; i < data.length; i++) {
				out.writeInt(data[i]);
			}
			out.flush();
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
     			e.printStackTrace();
		}

	}
	
	public static void readStuff(InputStream rawIn){
		try {
			DataInputStream in = new DataInputStream( new BufferedInputStream(rawIn));
			boolean eof = false;
			while( !eof ){
				try {
					int i = in.readInt();
					System.out.println("just read: "  + i );
				} catch (EOFException e) {
					// TODO: handle exception
					eof = true;
				}
				
			}
			System.out.println("Read all the data from the Pipe");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		try {
			
			final PipedOutputStream out = new PipedOutputStream();
			final PipedInputStream in = new PipedInputStream(out);
			
			Runnable runA = new Runnable(){
				public void run(){
					writeStuff(out);
				}
			};
			
			Thread threadA = new Thread(runA, "threadA");
			threadA.start();
			
			Runnable runB = new Runnable(){
				public void run(){
					readStuff(in);
				}
			};
			
			Thread threadB = new Thread(runB, "threadB");
			threadB.start();
	
						
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
