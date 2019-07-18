package com.huaxia.algorithms.chapter1_3;

import java.util.Stack;

import edu.princeton.cs.algs4.StdIn;
/*
 * 要求:将中序表达式转换为后序表达式
即
中序表达式	              后序表达式
2*3/(2-1)+3*(4-1)	23*21-/341-*+
2*3/(2-1)+3*(4-1)	23*21-/341-*+
*/
public class Practise1_3_10 {
	public static void main(String[] args) {
		/*
		 * 理一下思路,按照顺序读取中序表达式,分两个栈分别保存数字(或表达式)与运算符,
		 * 数字1+运算符+数字2→数字1+数字2+运算符
		 * 遇到一个右括号,开始拼接.
		 */
		
		//保存算术表达式的数字的栈
		Stack<String> vals = new Stack<String>();
		//保存运算符的栈
		Stack<String> ops = new Stack<String>();
		//用于标识是否有乘除
		boolean flag = false;
		//将输入的表达式从左往右进行读取
		//输入不为空时
		while(!StdIn.isEmpty()){
			String s = StdIn.readString();
			//读取到左括号时,则需要将flag设为false,防止乘除先于括号内容进行拼接
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
			//遇到右括号或者前一个运算符为乘除时开始拼接
			}else if(s.equals(")")){
				merge(vals,ops);
				//检验运算符栈中下一个弹出的是否为乘除,若为乘除,则需要继续进行拼接
				if(!ops.isEmpty()&&flag==true){
				String op = ops.peek();
				if(op.equals("*")||op.equals("/")){
					merge(vals,ops);
				}
				//完成拼接后将flag改成false
				flag = false;
				}
			//既不是运算符又不是括号时,则当成数字处理,塞入数字栈
			}else{
				vals.push(s);
				//当前一个运算符为乘除时,开始进行拼接
				if(!ops.isEmpty()&&flag==true){
				String op = ops.peek();
				if(op.equals("*")||op.equals("/")){
					merge(vals,ops);
					
				}
				flag = false;
				}
			}
			
				
			
		}
		//当运算符栈还不为空时,需要继续进行拼接
		while(!ops.isEmpty()){
			merge(vals,ops);
		}
		//打印拼接结果,也就是数字栈中的唯一成员
		String finalExpression = vals.pop();
	//更改逆序为顺序
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
		//弹出一个运算符用于拼接
		String op = ops.pop();
		if(op.equals("+")){
			//再弹出一个数进行计算,并更新v值
			v = "+"+ vals.pop() +vals.pop();
		}else if(op.equals("-")){
			v = "-"+vals.pop() + vals.pop();
		}else if(op.equals("*")){
			v = "*"+vals.pop() + vals.pop();
		}else if(op.equals("/")){
			v = "/"+ vals.pop() +vals.pop();
		}
		//将拼接结果塞回栈
		vals.push(v);
		
	}

}
