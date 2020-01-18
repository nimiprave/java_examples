package java_examples;
 
import java.lang.reflect.*;

public class ClassLoaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try{
    	   
    	   Class<?> c = Class.forName("java.awt.Point");
    	   System.out.println("name = " + c.getName());
    	   System.out.println("package: " + c.getPackage());
    	   Method[] methods = c.getDeclaredMethods();
    	   System.out.println(" -----------------Class Methods----------------------------------");
    	   for(Method method : methods ){
    		   System.out.println(method.getName());
    	   }
       }catch(ClassNotFoundException e){
    	   System.out.println(e.getMessage());
       		}
        
	}

}
