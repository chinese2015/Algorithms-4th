package com.huaxia.algorithms.chapter1_3;

import java.util.Stack;

import edu.princeton.cs.algs4.StdIn;

public class Evaluate {
	
	public static void main(String[] args) {
		//保存算术表达式的数字的栈
		Stack<Double> vals = new Stack<Double>();
		//保存运算符的栈
		Stack<String> ops = new Stack<String>();
		
		//将输入的表达式从左往右进行读取
		//输入不为空时
		while(!StdIn.isEmpty()){
			String s = StdIn.readString();
			//先读取到左括号
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
			//遇到有括号后开始计算
			}else if(s.equals(")")){
				//弹出一个数用于计算
				double v = vals.pop();
				//弹出一个运算符用于计算
				String op = ops.pop();
				if(op.equals("+")){
					//再弹出一个数进行计算,并更新v值
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
				//将运算结果塞回栈
				vals.push(v);
			//既不是运算符又不是括号时,则当成数字处理,塞入数字栈
			}else{
				vals.push(Double.parseDouble(s));
			}
				
			
		}
		//打印计算结果,也就是数字栈中的唯一成员
		System.out.println(vals.pop());
	}

}
