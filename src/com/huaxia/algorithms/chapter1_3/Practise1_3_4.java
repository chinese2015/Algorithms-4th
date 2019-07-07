package com.huaxia.algorithms.chapter1_3;

import java.util.Stack;

import edu.princeton.cs.algs4.StdIn;

public class Practise1_3_4 {
	
	/*	����˼·
	1.���ųɶԳ���
	2.���˳���������,��Ӧ�������ű�Ȼ���ȳ���
	3.�Ƚ�������ѹ��ջ��,��ȡ��������ʱ,����ջ��Ԫ�ؽ����ж�
*/
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		//��ȡ������ַ���
		while(!StdIn.isEmpty()){
			String s = StdIn.readString();
			if(s.equals("(")||s.equals("{")||s.equals("[")){
				stack.push(s);
			}else if(s.equals("}")&&!stack.pop().equals("{")){
				System.out.println("��ƥ��!");
			}else if(s.equals(")")&&!stack.pop().equals("(")){
				System.out.println("��ƥ��!");
			}else if(s.equals("]")&&!stack.pop().equals("[")){
				System.out.println("��ƥ��!");
			}
		}
	}
	
	
	
}
