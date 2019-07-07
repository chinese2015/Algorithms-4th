package com.huaxia.algorithms.chapter1_3;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item>{
	private Node first;
	private class Node{
		public Item item;
		public Node next;
	}
	
	public void add(Item item){
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator();
	}
	
	private class ListIterator implements Iterator<Item>{
		
		private Node current = first;

		@Override
		public boolean hasNext() {
			return current != null;
		}
		public void remove(){}

		@Override
		public Item next() {
			
			Item item = current.item;
			current = current.next;
			
			return item;
		}
		
	}
	
	
}
