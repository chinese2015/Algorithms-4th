package com.huaxia.algorithms.chapter1_1;

public class Practise1_1_19 {
	public static void main(String[] args) {
		int[] f = F(99);
		for(int i = 0;i<f.length;i++){
			System.out.println(i+":"+f[i]);
		}
		
		
	}
	public static int[] F(int n){
		//���е�쳲�����ʾ�������ٶȽ���,����һ��Сʱ��,NԼΪ55-56.�ɽ����еļ������洢��������
		//����һ��Nֵ,����Ϊ����ĳ���
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
