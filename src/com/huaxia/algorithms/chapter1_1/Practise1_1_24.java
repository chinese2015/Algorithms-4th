package com.huaxia.algorithms.chapter1_1;

public class Practise1_1_24 {
	public static void main(String[] args) {
		//ʹ��շת�����,����������������Լ��
		int GCD = getGCD(1024,213);
		System.out.println(GCD);
		
	}
	public static int getGCD(int m,int n){
		int p;//��ʱ������
		int q;//��ʱ����
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
