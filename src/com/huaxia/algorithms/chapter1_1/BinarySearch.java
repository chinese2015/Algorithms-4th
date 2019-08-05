package com.huaxia.algorithms.chapter1_1;

public class BinarySearch {
	public static int rank(int key,int[] a ){
		//低位数,默认为0
		int lo = 0;
		//高位数,默认为数组最后一位的索引
		int hi = a.length - 1;
		while(lo<=hi){
			int mid = (lo+hi)/2;
			if(key<a[mid]){
				hi = mid-1;
			}else if(key>a[mid]){
				lo = mid+1;
			}else
				return mid;
		}
		return -1;
		
	}
	public static int rank(int key, int[] a, int lo, int hi) {
		if (lo > hi) {
			return -1;
		}
		int mid = lo + (hi - lo) / 2;
		if (key < a[mid]) {
			return rank(key, a, lo, mid - 1);
		} else if (key > a[mid]) {
			return rank(key, a, mid + 1, hi);
		} else {
			return mid;
		}
	}	
	public static void main(String[] args) {
		int key = 32;
		int[] arrs = {1,2,3,5,7,31,32,33,55,87};
		System.out.println(rank(key,arrs));
	}

}
