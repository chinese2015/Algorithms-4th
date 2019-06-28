package com.huaxia.algorithms.chapter1_2;

public class Practise1_2_6 {
	public static void main(String[] args) {
		boolean result = isCircularRotation("hahaha", "ahahah");
		System.out.println(result);
		
	}
	public static boolean isCircularRotation(String s,String t){
		if(s.length()==t.length()&&(s+s).indexOf(t)>0){
			return true;
		}else
			return false;
	}
}
