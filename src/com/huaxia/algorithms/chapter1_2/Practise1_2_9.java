package com.huaxia.algorithms.chapter1_2;
import edu.princeton.cs.algs4.Counter;


public class Practise1_2_9 {
	public static int rank(int key,int[] a,Counter c ){
		//��λ��,Ĭ��Ϊ0
		int lo = 0;
		//��λ��,Ĭ��Ϊ�������һλ������
		int hi = a.length - 1;
		while(lo<=hi){
			int mid = (lo+hi)/2;
			if(key<a[mid]){
				hi = mid-1;
				c.increment();
			}else if(key>a[mid]){
				lo = mid+1;
				c.increment();
			}else
				return mid;
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		int key = 32;
		int[] arrs = {1,2,3,5,7,31,32,33,55,87};
		Counter count = new Counter("binarySearchCount");
		System.out.println(rank(key,arrs,count));
		System.out.println(count);
	}



}
