package java_examples;
import java.lang.reflect.Method;

import nimi.first.*;

public class IntraPackageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(nimi.first.nimi_show.housecolor);
        System.out.println(nimi.first.nimi_show.housename);
        System.out.println(nimi.first.nimi_show.class.getName());
        Method methods[] = nimi_show.class.getMethods();
        System.out.println("Printing method Names:");
        for(Method method: methods){
        	System.out.println(method.getName());
        }
        		
        
        
	}

}
