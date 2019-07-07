package com.huaxia.algorithms.chapter1_3;

import java.util.Stack;

import edu.princeton.cs.algs4.StdIn;

public class Practise1_3_4 {
	
	/*	基本思路
	1.括号成对出现
	2.最后顺序的左括号,对应的右括号必然最先出现
	3.先将左括号压入栈内,读取到右括号时,弹出栈内元素进行判断
*/
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		//读取输入的字符串
		while(!StdIn.isEmpty()){
			String s = StdIn.readString();
			if(s.equals("(")||s.equals("{")||s.equals("[")){
				stack.push(s);
			}else if(s.equals("}")&&!stack.pop().equals("{")){
				System.out.println("不匹配!");
			}else if(s.equals(")")&&!stack.pop().equals("(")){
				System.out.println("不匹配!");
			}else if(s.equals("]")&&!stack.pop().equals("[")){
				System.out.println("不匹配!");
			}
		}
	}
	
	
	
}
