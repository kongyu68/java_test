package java_test;

import java.util.Scanner;

/* 通过Scanner输入一个1-7之间的整数，使用三元操作符判断时工作日还是周末？

 今天星期几？
 4
 今天是工作日*/

public class TernaryOprator {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("今天是周几？");

		int k = s.nextInt();
		String m = "今天是工作日，要努力加油哦！";
		String t = "今天是周末，祝你休息愉快！";

		if (1 <= k && k <= 7) {
			System.out.println(k < 6 ? m : t);
		} else {
			System.out.println("您的输入有误！");
		}
	}
}
