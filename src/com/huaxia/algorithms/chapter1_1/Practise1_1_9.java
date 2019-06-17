package com.huaxia.algorithms.chapter1_1;

public class Practise1_1_9 {
	public static void main(String[] args) {
		//将一个正整数转化为一个二进制数的字符串
		int n = 1024;
		//自带方法
		//String s = Integer.toBinaryString(n);
		String s =toBinaryString(n);
		//输入1024,输出10000000000
		System.out.println(s);
		}
	
	public static String toBinaryString(int n){
		String s = "";
		for(int j = n;j>0;j/=2){
			s = (j%2)+s;
		}
		return s;
	}
}
