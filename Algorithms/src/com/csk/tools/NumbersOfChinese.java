package com.csk.tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//统计汉字的个数
public class NumbersOfChinese {
	public static void main(String[] args) {
	}

	public static int countChinese(String str) {
		int count = 0;
		Pattern p = Pattern.compile("[\\u4e00-\\u9fa5]");
		Matcher m = p.matcher(str);
		while (m.find()) {
			count++;
		}
		return count;
	}
}
