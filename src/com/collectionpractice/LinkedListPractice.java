package com.collectionpractice;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {

	public static void main(String[] args) {
		
		//List <Object> ll =  new LinkedList <> ();
		
		LinkedList ll = new LinkedList ();
		
		ll.add(10);
		ll.add(12);
		ll.add(13);
		ll.add(14);
		ll.add(15);
		
		ll.addFirst(100);
		
		
		System.out.println(ll);
		
		ll.poll();
		
		System.out.println(ll);
		
		
		ll.offer(5000);
		
		System.out.println(ll);
		
		ll.offerFirst(200);
		
		System.out.println(ll);
		
		ll.offerLast(400);
		
		System.out.println(ll);
		
		
		Object clone = ll.clone();
		
		System.out.println(clone);
		
		
	
		
//		ll.pollLast();
//		
//		System.out.println(ll);
//		
//		ll.pollFirst();
//		
//		System.out.println(ll);
//		
//		
//		
//		ll.add(0, 20);
//		
//		System.out.println(ll);
//		
//		ll.remove(0);
//		
//		System.out.println(ll);
//	
//	
	}
	
	

}
