package com.huaxia.algorithms.chapter1_3;

import java.util.Stack;

import edu.princeton.cs.algs4.StdIn;

public class Evaluate {
	
	public static void main(String[] args) {
		//�����������ʽ�����ֵ�ջ
		Stack<Double> vals = new Stack<Double>();
		//�����������ջ
		Stack<String> ops = new Stack<String>();
		
		//������ı��ʽ�������ҽ��ж�ȡ
		//���벻Ϊ��ʱ
		while(!StdIn.isEmpty()){
			String s = StdIn.readString();
			//�ȶ�ȡ��������
			if(s.equals("(")){
				;
			}else if(s.equals("+")){
				ops.push(s);
			}else if(s.equals("-")){
				ops.push(s);
			}else if(s.equals("*")){
				ops.push(s);
			}else if(s.equals("/")){
				ops.push(s);
			}else if(s.equals("sqrt")){
				ops.push(s);
			//���������ź�ʼ����
			}else if(s.equals(")")){
				//����һ�������ڼ���
				double v = vals.pop();
				//����һ����������ڼ���
				String op = ops.pop();
				if(op.equals("+")){
					//�ٵ���һ�������м���,������vֵ
					v = vals.pop() + v;
				}else if(op.equals("-")){
					v = vals.pop() - v;
				}else if(op.equals("*")){
					v = vals.pop() * v;
				}else if(op.equals("/")){
					v = vals.pop() / v;
				}else if(op.equals("sqrt")){
					v = Math.sqrt(v);
				}
				//������������ջ
				vals.push(v);
			//�Ȳ���������ֲ�������ʱ,�򵱳����ִ���,��������ջ
			}else{
				vals.push(Double.parseDouble(s));
			}
				
			
		}
		//��ӡ������,Ҳ��������ջ�е�Ψһ��Ա
		System.out.println(vals.pop());
	}

}
