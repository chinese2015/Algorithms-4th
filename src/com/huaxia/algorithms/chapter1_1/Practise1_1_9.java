package com.huaxia.algorithms.chapter1_1;

public class Practise1_1_9 {
	public static void main(String[] args) {
		//��һ��������ת��Ϊһ�������������ַ���
		int n = 1024;
		//�Դ�����
		//String s = Integer.toBinaryString(n);
		String s =toBinaryString(n);
		//����1024,���10000000000
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
