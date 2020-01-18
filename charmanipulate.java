package java_examples;

import java.lang.invoke.ConstantCallSite;

public class charmanipulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int lowerlimit = 0;
		int upperlimit = 249;
       String str = "In ABAP programs, the API is implemented using interfaces from the class library with the naming convention IF_IXML_.... The access class CL_IXML contains factory methods for creating objects such as streams, parsers, documents, and renderers. These objects are then accessed using interface reference variables. The classes and interfaces are documented in Class Builder. i was able to find things that are beautiful in nature and often represented as facsts. The people are biased with their thinking. Leave alone for exploring the opporunities of the cosmos";
       System.out.println("Size: " + str.length());
       if(str.length() > 250){
    	   
    	  while(upperlimit <= str.length()){
    		  System.out.println(str.substring(lowerlimit, upperlimit));
    		  System.out.println("=>");
    		  lowerlimit = upperlimit;
    		  upperlimit = upperlimit + 249;
    	  } 
    	 System.out.println(str.substring(lowerlimit, str.length() - 1 ));
    	 System.out.println("=>");
       }
	}
      

}
