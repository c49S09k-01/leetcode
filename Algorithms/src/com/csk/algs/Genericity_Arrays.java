package com.csk.algs;
//在 java 中 如何创建泛型数组

class A<Item>{
	Item[] items;
	@SuppressWarnings("unchecked")
	A(int n){
		//这种方法是不被容许的
		//items = new Items[n];
		//以下方法才是正确的
		items = (Item[])(new Object[n]);
	}
}

public class Genericity_Arrays {
	
}
