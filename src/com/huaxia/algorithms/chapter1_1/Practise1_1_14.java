package com.huaxia.algorithms.chapter1_1;

public class Practise1_1_14 {
	public static void main(String[] args) {
		//дһ����̬����lg(),����n,���ز�����log2(n)���������ֵ
		
		int lg = lg(10);
		System.out.println(lg);
	}
	public static int lg(int n){
		//���ڼ�¼�����n��2���Ĵ���,�ô�����Ϊlg(n)
		int j = 0;
		//ÿѭ��һ��,��n��2��һ��,j�ۼ�,Ȼ��
		
		for( int i = n;i>1;i/=2){
			j++;
		}
		return j;
		
		
	}
}
