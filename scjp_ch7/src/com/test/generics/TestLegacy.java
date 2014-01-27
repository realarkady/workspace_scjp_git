package com.test.generics;

//a Java 5 class using a generic collection
import java.util.*;
public class TestLegacy {
 public static void main(String[] args) {
     List myList = new ArrayList(); 
                                  // type safe collection
     myList.add(4);
     myList.add(6);
     //myList.add(new Object());
     Adder adder = new Adder();
     int total = adder.addAll(myList); 
                           // pass it to an untyped argument
     System.out.println(total);
 }
}

class Adder {
	   int addAll(List<Integer> list) {
	      // method with a non-generic List argument,
	      // but assumes (with no guarantee) that it will be Integers
	      list.add(1);
	      Iterator<Integer> it = list.iterator();
	      int total = 0;
	      while (it.hasNext()) {
	    	  /*
	    	  int i=0;
	    	  Object o = it.next();
	    	  if(o instanceof Integer){
	    		  i = ((Integer)o).intValue();
	    		  total += i;
	    	  }
	    	  */
	    	  int i = ((Integer)it.next()).intValue();
    		  total += i;
	      }
	      return total;
	   }
	}
