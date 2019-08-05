/**
 * 
 */
package com.huaxia.algorithms.chapter1_4;

import com.huaxia.algorithms.chapter1_1.BinarySearch;

/**
 * @author Administrator
 *
 */
public class Ext20 {
	//��˫������(�ȵ��������ٵ����ݼ�)��ȡ���ֵ
	private static int getMax(int[]a,int lo,int hi){
		int mid = (lo+hi)/2;
		if(mid > 0&&a[mid] < a[mid-1]){
			return getMax(a,lo,mid-1);
		}else if(mid < a.length-1 && a[mid]<a[mid+1]){
			return getMax(a,mid+1,hi);
		}else{
			return mid;
		}
	}
	
	public static int getMax(int[]a){
		return getMax(a,0,a.length-1);
	}
	
	/*
	 * binarysearch in decreasing orders
	 */
	
	public static int rank(int[]a,int key,int lo,int hi){
		if(lo>hi){
			return -1;
		}
		int mid = (lo+hi)/2;
		if(key>a[mid]){
			return rank(a,key,lo,mid-1);
		}else if(key<a[mid]){
			return rank(a,key,mid+1,hi);
		}else{
			return mid;
		}
	}
	//��˫������ֳ������,�ֱ��ö��ֲ��ҽ�������
	public static boolean contains(int[]a,int key){
		//�õ�����ķֽ��
		int max = getMax(a);
		if(BinarySearch.rank(key,a,0,max)!=-1){
			return true;
		}else if(rank(a,key,max,a.length-1)!=-1){
			return true;
		}else{
			return false;
		}
	}

	
}
