package com.huaxia.algorithms.chapter1_3;

import java.util.Stack;

import edu.princeton.cs.algs4.StdIn;
/*
 * Ҫ��:��������ʽת��Ϊ������ʽ
��
������ʽ	              ������ʽ
2*3/(2-1)+3*(4-1)	23*21-/341-*+
2*3/(2-1)+3*(4-1)	23*21-/341-*+
*/
public class Practise1_3_10 {
	public static void main(String[] args) {
		/*
		 * ��һ��˼·,����˳���ȡ������ʽ,������ջ�ֱ𱣴�����(����ʽ)�������,
		 * ����1+�����+����2������1+����2+�����
		 * ����һ��������,��ʼƴ��.
		 */
		
		//�����������ʽ�����ֵ�ջ
		Stack<String> vals = new Stack<String>();
		//�����������ջ
		Stack<String> ops = new Stack<String>();
		//���ڱ�ʶ�Ƿ��г˳�
		boolean flag = false;
		//������ı��ʽ�������ҽ��ж�ȡ
		//���벻Ϊ��ʱ
		while(!StdIn.isEmpty()){
			String s = StdIn.readString();
			//��ȡ��������ʱ,����Ҫ��flag��Ϊfalse,��ֹ�˳������������ݽ���ƴ��
			if(s.equals("(")){
				flag = false;
			}else if(s.equals("+")){
				ops.push(s);
			}else if(s.equals("-")){
				ops.push(s);
			}else if(s.equals("*")){
				ops.push(s);
				flag = true;
			}else if(s.equals("/")){
				ops.push(s);
				flag = true;
			//���������Ż���ǰһ�������Ϊ�˳�ʱ��ʼƴ��
			}else if(s.equals(")")){
				merge(vals,ops);
				//���������ջ����һ���������Ƿ�Ϊ�˳�,��Ϊ�˳�,����Ҫ��������ƴ��
				if(!ops.isEmpty()&&flag==true){
				String op = ops.peek();
				if(op.equals("*")||op.equals("/")){
					merge(vals,ops);
				}
				//���ƴ�Ӻ�flag�ĳ�false
				flag = false;
				}
			//�Ȳ���������ֲ�������ʱ,�򵱳����ִ���,��������ջ
			}else{
				vals.push(s);
				//��ǰһ�������Ϊ�˳�ʱ,��ʼ����ƴ��
				if(!ops.isEmpty()&&flag==true){
				String op = ops.peek();
				if(op.equals("*")||op.equals("/")){
					merge(vals,ops);
					
				}
				flag = false;
				}
			}
			
				
			
		}
		//�������ջ����Ϊ��ʱ,��Ҫ��������ƴ��
		while(!ops.isEmpty()){
			merge(vals,ops);
		}
		//��ӡƴ�ӽ��,Ҳ��������ջ�е�Ψһ��Ա
		String finalExpression = vals.pop();
	//��������Ϊ˳��
		String seq = "";
		for(int i = finalExpression.length()-1;i>=0;i--){
			seq+=finalExpression.charAt(i);
		}
		System.out.println(seq);
	}

	/**
	 * 
	 */
	private static void merge(Stack<String> vals,Stack<String> ops) {
		String v = "";
		//����һ�����������ƴ��
		String op = ops.pop();
		if(op.equals("+")){
			//�ٵ���һ�������м���,������vֵ
			v = "+"+ vals.pop() +vals.pop();
		}else if(op.equals("-")){
			v = "-"+vals.pop() + vals.pop();
		}else if(op.equals("*")){
			v = "*"+vals.pop() + vals.pop();
		}else if(op.equals("/")){
			v = "/"+ vals.pop() +vals.pop();
		}
		//��ƴ�ӽ������ջ
		vals.push(v);
		
	}

}
