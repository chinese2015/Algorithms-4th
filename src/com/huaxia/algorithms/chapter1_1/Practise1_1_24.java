package com.huaxia.algorithms.chapter1_1;

public class Practise1_1_24 {
	public static void main(String[] args) {
		//使用辗转相除法,获得两个整数的最大公约数
		int GCD = getGCD(1024,213);
		System.out.println(GCD);
		
	}
	public static int getGCD(int m,int n){
		int p;//临时被除数
		int q;//临时除数
		if(m>n){
			p=m;
			q=n;
		}else if(m<n){
			p=n;
			q=m;
		}else
			return m;
		while(q!=0){
			System.out.println(p+q);
			int t = q;
			q=p%q;
			p = t;
			
		}
		return p;
}
}
