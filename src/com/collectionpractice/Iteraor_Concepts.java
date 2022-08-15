package com.collectionpractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Iteraor_Concepts {
	
	public static void main(String[] args) {
		
		
		LinkedList ll =  new LinkedList();
		
		ll.add("A");
		
		ll.add("B");
		
	    ll.add("C");
	    
	    ll.add("D");
	    
//	    Iterator it = ll.iterator();
//	    
//	    
//	  while(it.hasNext()) {
//		  
//		  if(it.next().equals("B")) {
//			  
//			  it.remove();
//		  }
//		  		
//		  
//		
////	    boolean hn = it.hasNext();
////	    
////	    System.out.println(hn);
////	    
////	    while(it.hasNext()){
////	   
////	    	
////	        if( it.next().equals("D"));
////	         
////	         it.remove();
////	         
////	         
////	       
////	    }
////	    
////	    System.out.println(ll);
//	    
	    
	//}
	 // System.out.println(ll);
	    
	
	  ListIterator li = ll.listIterator();
	  
	  
	  li.add("E");
	  
     while(li.hasNext()) {
    	 
    	 if(li.next().equals("D")) {
    		 
    		 li.set("E");
    	 }
     }
	 
     System.out.println(ll);
	 
	}	
	
	
     

}
