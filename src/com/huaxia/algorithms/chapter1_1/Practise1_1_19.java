package com.huaxia.algorithms.chapter1_1;

public class Practise1_1_19 {
	public static void main(String[] args) {
		int[] f = F(99);
		for(int i = 0;i<f.length;i++){
			System.out.println(i+":"+f[i]);
		}
		
		
	}
	public static int[] F(int n){
		//书中的斐波那契示例运行速度较慢,运行一个小时后,N约为55-56.可将已有的计算结果存储到数组中
		//传入一个N值,可作为数组的长度
		int[] fibonacci = new int[n+1];
		if(n==0)
			return fibonacci;
		fibonacci[1]=1;
		if(n==1){
		fibonacci[1] = 1;
		return fibonacci;
	}
		
		for(int i = 2;i<=n;i++){
			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
		}
		return fibonacci; 
		
}
}
