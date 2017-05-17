package com.csk.algs;

import java.io.IOException;
import java.util.Stack;

import edu.princeton.cs.algs4.StdIn;

// evaluate 求值 该算法解决的是表达式求值问题
// Dijkstra 的双栈算术表达式求值算法
// 用两个栈，一个用于保存运算符，一个用于保存操作数
// Ctrl + z 结束输出 ,且括号，数字，运算符之间要有空格
public class Evaluate {	
	public static void main(String[] args) throws IOException {
		Stack<String> ops = new Stack<>();
		Stack<Double> vals = new Stack<>();
		String s;
		Double v;
		String op;
		while(!StdIn.isEmpty()){
			s = StdIn.readString();
			if(s.equals("("));
			else if(s.equals("+")) ops.push(s);
			else if(s.equals("-")) ops.push(s);
			else if(s.equals("*")) ops.push(s);
			else if(s.equals("/")) ops.push(s);
			else if(s.equals("sqrt")) 	ops.push("sqrt");
			else if(s.equals(")")) {
				op =  ops.pop();
				v = vals.pop();
				if(op.equals("+")) v = vals.pop() + v;
				else if(op.equals("-")) v = vals.pop() - v;
				else if(op.equals("*")) v = vals.pop() * v;
				else if(op.equals("/")) v = vals.pop() / v;
				else if(op.equals("sqrt")) v = Math.sqrt(v);
				vals.push(v);
			}
			else vals.push(Double.parseDouble(s));
		}
			//System.out.println(c);
		System.out.println(vals.pop());
	}
}
