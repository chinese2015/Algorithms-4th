package com.huaxia.algorithms.chapter1_1;

public class Practise1_1_6 {
	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		for(int i =0;i<=15;i++){
			System.out.println(x);
			x = x+y;
			y = x-y;
		}
	}
}
