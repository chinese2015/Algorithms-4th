package com.huaxia.algorithms.chapter1_3;

import java.util.Iterator;

public class Queue<Item> implements Iterator<Item>{
	private Node first;
	private Node last;
	//���ڱ����Ա��
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
	//��β�������Ա
	public void enqueue(Item item){
		//���ȵõ���β��������
		//������β��node,����item�Լ�node
		//��firstָ����ͷ��
		Node oldLast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		
		//������Ԫ��ǰ����Ϊ��,��first��lastָ��ͬһ�ڵ�
		if(isEmpty()){first = last;}
		else oldLast.next = last;
		N++;
	}
	
	//��ͷ��ȡ����Ա
	public Item dequeue(){
		//���ȵõ�first������
		//Ȼ��first����һ����Ϊfirst(��ʱ��Ҫ�����ж�,first
		first = first.next;
		Item item = first.item;
		//������Ϊ��,��last��Ϊnull
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
