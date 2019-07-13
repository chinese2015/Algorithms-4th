package com.huaxia.algorithms.chapter1_3;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<Item> implements Iterable<Item> {
	private Node first;
	private int N;
	private int operates;

	private class Node {
		Item item;
		Node next;

		Node() {
		};



	}

	public Stack() {
		first = null;
		N = 0;
	}



	public boolean isEmpty() {
		return first == null;
	}

	public int size() {
		return N;
	}

	public void push(Item item) {
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
		operates++;
	}

	public Item pop() {
		Item item = first.item;
		first = first.next;
		N--;
		operates++;
		return item;
	}

	@Override
	public Iterator<Item> iterator() {
		return new ListIterator();
	}

	/**
	 * Exercise 1.3.50
	 * 
	 * @author Jimmy
	 *
	 */
	private class ListIterator implements Iterator<Item> {
		private Node current = first;
		private int count = operates;

		@Override
		public boolean hasNext() {
			if (count != operates) {
				throw new ConcurrentModificationException();
			}
			return current != null;
		}

		@Override
		public Item next() {
			if (count != operates) {
				throw new ConcurrentModificationException();
			}
			Item item = current.item;
			current = current.next;
			return item;
		}

		@Override
		public void remove() {
		}
	}



	public Item peek(){
		if(isEmpty()){
			throw new NoSuchElementException("Stack underflow");
		}else{
			return first.item;
		}
	}


	public static void main(String[] args) {

	}
}
