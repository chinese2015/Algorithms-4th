package com.huaxia.algorithms.chapter1_3;

import java.util.Iterator;

public class ResizingArrayStack<Item> {
	
	private Item[] a = (Item[]) new Object[1];
	private int N = 0;
	
	public boolean isEmpty(){
		return N == 0;
	}
	public int size(){
		return a.length;
	}
	
	private void resize(int max){
		Item[] temp  = (Item[]) new Object[max];
		for(int i =0;i<max;i++){
			temp[i] = a[i];
		}
		a = temp;
	}
	public Item pop(){
		Item item = a[--N];
		a[N]=null;
		if(N<a.length/4){
			resize(a.length/2);
		}
		return item;
		
	}
	public void push(Item item){
		a[N++] = item;
		if(N>a.length/2){
			resize(2*a.length);
		}
	}
	public void remove(){
		
	}
	
	public Iterator iterator(){
		return new ResizingArrayStackIterator();
	}
	
	private class ResizingArrayStackIterator implements Iterator<Item>{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return N==0;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			return a[--N];
		}
		public void remove(){
			
		}
		
	}
	

}
