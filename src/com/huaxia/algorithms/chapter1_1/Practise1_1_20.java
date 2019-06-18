package com.huaxia.algorithms.chapter1_1;

public class Practise1_1_20 {
	public static void main(String[] args) {
		//传入一个N,计算ln(N!)的值
		System.out.println(ln(5));
		System.out.println(Math.log(120));
		
	}
	public static double ln(int n){
		double result = 0;
		for(int i =1 ;i<=n;i++){
			result += Math.log(i);
		}
		return result;
}
}
