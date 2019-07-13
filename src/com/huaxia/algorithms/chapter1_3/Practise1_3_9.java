package com.huaxia.algorithms.chapter1_3;

import java.util.Stack;

import edu.princeton.cs.algs4.StdIn;

public class Practise1_3_9 {
	public static void main(String[] args) {
		//�����������ʽ�����ֵ�ջ
		Stack<String> vals = new Stack<String>();
		//�����������ջ
		Stack<String> ops = new Stack<String>();
/*		����˼·,�������������ź�,��ʼ����������+����+�����+����+�����ŵ�ƴ��,
		Ȼ��ƴ�ӵĽ����������ջ�������(��ƴ���ַ�����Ϊ��һ��ƴ�ӵ����ֽ�ɫʹ��)*/
		while(!StdIn.isEmpty()){
			String s = StdIn.readString();
			if(s.equals("+")){
				ops.push(s);
			}else if(s.equals("-")){
				ops.push(s);
			}else if(s.equals("*")){
				ops.push(s);
			}else if(s.equals("/")){
				ops.push(s);
			}else if(s.equals("sqrt")){
				ops.push(s);
			//���������ź�ʼƴ��
			}else if(s.equals(")")){
				//����һ�����������ƴ��
				String op = ops.pop();
				String v = "";
				if(op.equals("+")){
					//��������������ƴ��,������vֵΪƴ�Ӻ�Ľ��
					v = ")"+vals.pop()+"+"+ vals.pop()+"(";//�˴�ƴ�ӵ�˳��Ϊ����,��1+2).����ƴ��Ϊ2+1,����Ҫȫ�����,������ַ����������
				}else if(op.equals("-")){
					v = ")"+vals.pop() +"-"+ vals.pop()+"(";
				}else if(op.equals("*")){
					v = ")"+vals.pop() +"*"+ vals.pop()+"(";
				}else if(op.equals("/")){
					v =")" +vals.pop() +"/"+ vals.pop()+"(";
				}
				//��ƴ�ӽ������ջ
				vals.push(v);
			//�Ȳ���������ֲ�������ʱ,�򵱳����ִ���,��������ջ
			}else{
				vals.push(s);
			}
		}
		//��ӡƴ�ӽ��,Ҳ��������ջ�е�Ψһ��Ա
			String finalExpression = vals.pop();
			System.out.println(finalExpression);
		//��������Ϊ˳��
			String seq = "";
			for(int i = finalExpression.length()-1;i>=0;i--){
				seq+=finalExpression.charAt(i);
			}
			System.out.println(seq);
	}
	
}
