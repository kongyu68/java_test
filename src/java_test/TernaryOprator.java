package java_test;

import java.util.Scanner;

/* ͨ��Scanner����һ��1-7֮���������ʹ����Ԫ�������ж�ʱ�����ջ�����ĩ��

 �������ڼ���
 4
 �����ǹ�����*/

public class TernaryOprator {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("�������ܼ���");

		int k = s.nextInt();
		String m = "�����ǹ����գ�ҪŬ������Ŷ��";
		String t = "��������ĩ��ף����Ϣ��죡";

		if (1 <= k && k <= 7) {
			System.out.println(k < 6 ? m : t);
		} else {
			System.out.println("������������");
		}
	}
}
