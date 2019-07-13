package com.huaxia.algorithms.chapter1_3;

import java.util.Stack;

import edu.princeton.cs.algs4.StdIn;

public class Practise1_3_9 {
	public static void main(String[] args) {
		//保存算术表达式的数字的栈
		Stack<String> vals = new Stack<String>();
		//保存运算符的栈
		Stack<String> ops = new Stack<String>();
/*		基本思路,就是碰到右括号后,开始进行左括号+数字+运算符+数字+右括号的拼接,
		然后将拼接的结果放入数字栈保存待用(该拼接字符串作为下一次拼接的数字角色使用)*/
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
			//遇到右括号后开始拼接
			}else if(s.equals(")")){
				//弹出一个运算符用于拼接
				String op = ops.pop();
				String v = "";
				if(op.equals("+")){
					//弹出两个数进行拼接,并更新v值为拼接后的结果
					v = ")"+vals.pop()+"+"+ vals.pop()+"(";//此处拼接的顺序为逆序,若1+2).弹出拼接为2+1,则需要全逆序后,将结果字符串倒序输出
				}else if(op.equals("-")){
					v = ")"+vals.pop() +"-"+ vals.pop()+"(";
				}else if(op.equals("*")){
					v = ")"+vals.pop() +"*"+ vals.pop()+"(";
				}else if(op.equals("/")){
					v =")" +vals.pop() +"/"+ vals.pop()+"(";
				}
				//将拼接结果塞回栈
				vals.push(v);
			//既不是运算符又不是括号时,则当成数字处理,塞入数字栈
			}else{
				vals.push(s);
			}
		}
		//打印拼接结果,也就是数字栈中的唯一成员
			String finalExpression = vals.pop();
			System.out.println(finalExpression);
		//更改逆序为顺序
			String seq = "";
			for(int i = finalExpression.length()-1;i>=0;i--){
				seq+=finalExpression.charAt(i);
			}
			System.out.println(seq);
	}
	
}
