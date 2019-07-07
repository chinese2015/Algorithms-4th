package com.huaxia.algorithms.chapter1_3;

import java.util.Iterator;

public class Queue<Item> implements Iterator<Item>{
	private Node first;
	private Node last;
	//用于保存成员数
	private int N = 0;
	//
	private class Node{
		Item item;
		Node next;
	}
	public int size(){
		return N;
	}
	public boolean isEmpty(){
		return first==null;
	}
	//在尾部加入成员
	public void enqueue(Item item){
		//首先得到旧尾部的引用
		//创建新尾部node,包括item以及node
		//将first指向新头部
		Node oldLast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		
		//若加入元素前队列为空,则first和last指向同一节点
		if(isEmpty()){first = last;}
		else oldLast.next = last;
		N++;
	}
	
	//在头部取出成员
	public Item dequeue(){
		//首先得到first的引用
		//然后将first的下一个设为first(此时需要进行判断,first
		first = first.next;
		Item item = first.item;
		//若队列为空,则将last设为null
		if(isEmpty()) last = null;
		N--;
		return item;
				
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Item next() {
		// TODO Auto-generated method stub
		return null;
	}
}
