package com.collectionpractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPractice {
	
	
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		hm.put("Bharath", 101);
		
		hm.put("Napa", 102);
		
		hm.put("Balaji", 103);
		
		hm.put("Nirmala", 104);
		
		
	        Set et = hm.entrySet();
	        System.out.println(et);
	        
	        Iterator i = et.iterator();
	        
	        while(i.hasNext()) {
	        	
	        	
	        
	        	Object o = i.next();
	        	
	        	Map.Entry e = (Map.Entry) o;
	        	
	        	Object value = e.getValue();
	        	Object key = e.getKey();
	        	
	        	System.out.println(value);
	        	System.out.println(key);
	        	
	        	if(key.equals("Bharath")) {
	        		
	        		e.setValue(200);
	        		
	        	
	        	}
	        	
	        	
	        }
	        
	        System.out.println("After set : " + hm);
		
	//System.out.println(hm.get("Bharath"));
	
	//System.out.println(hm.remove("Napa"));
	
	System.out.println(hm.remove("Balaji", 103));
	
	System.out.println(hm);
		
		//System.out.println(hm);
		
		Set es = hm.entrySet();
		
		System.out.println(es);
		
		Set ks = hm.keySet();
		
		System.out.println(ks);
		
		Collection values = hm.values();
		
		System.out.println(values);
		
		    Iterator i1 = es.iterator();
		    
		    while(i1.hasNext()) {
		    	
		    	//System.out.println(i.next());
		    	
		    	Map.Entry me = (Map.Entry) i1.next();
		    	
		  
		    	
		       if(me.getValue().equals("104")) {
		    	   
		    	 // me.setValue("200");
		    	   
		    	   System.out.println(me.getKey());
		       }
		       
		       System.out.println(me);
		    	    }
		    
		  
		
	}

}
