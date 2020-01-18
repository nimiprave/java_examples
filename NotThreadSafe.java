package java_examples;


public class NotThreadSafe {
    StringBuffer sb = new StringBuffer();
    public void add(String text){
    	sb.append(text);
    	System.out.println(sb.toString());
   	 }
}
