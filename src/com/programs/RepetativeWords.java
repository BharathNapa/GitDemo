package com.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepetativeWords {
	
	public static void main(String[] args) {
		
		
		String s = "java selenium java api jira jira git git jenkins";
		
		Map<String, Integer> m = new HashMap<>();
		
		String[] allWords = s.split(" ");
		
		for (String word : allWords) {
			
			if (m.containsKey(word)) {
				
				Integer value = m.get(word);
				
				m.put(word, value+1);
				
								
			} else {
			
			
				 m.put(word, 1);
			
			
		}
		
		
		
		
			
		
		//1. split a word from sentence
		//2. take single word
		//3. compare with following words
		//4. if match, increase count
		//5. if count>1 print
		 
		
	}
	
		System.out.println(m);

	                 
	Set<Entry<String, Integer>> entrySet = m.entrySet();
	
	for (Entry<String, Integer> entry : entrySet) {
		
		if (entry.getValue()>1) {
			
			System.out.println(entry);
			
		}
		
	}

	}
	
}
