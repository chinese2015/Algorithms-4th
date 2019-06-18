package com.huaxia.algorithms.chapter1_1;

public class Practise1_1_14 {
	public static void main(String[] args) {
		//写一个静态方法lg(),传入n,返回不大于log2(n)的最大整数值
		
		int lg = lg(10);
		System.out.println(lg);
	}
	public static int lg(int n){
		//用于记录传入的n被2除的次数,该次数即为lg(n)
		int j = 0;
		//每循环一次,即n被2除一次,j累加,然后
		
		for( int i = n;i>1;i/=2){
			j++;
		}
		return j;
		
		
	}
}
