package java_test;
import java.util.Scanner;

/*ʹ��System.out.println("") �����̨�������
 * �ӿ���̨�������ݣ���Ҫ�õ�Scanner��
 * */

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		//ʹ��Scanner��ȡ����
        int a = s.nextInt();
        System.out.println("��ȡ������ֵ�ǣ�"+a);
        
		//ʹ��Scanner��ȡ������
        float f = s.nextFloat();
        System.out.println("��ȡ�ĸ�������ֵ�ǣ�"+f);
        
		//ʹ��Scanner��ȡ�ַ���
        String str = s.nextLine();
        System.out.println("��ȡ���ַ����ǣ�"+str);
        
		//��ȡ�������󣬽��Ŷ�ȡ�ַ���
        /* ��Ҫע����ǣ������ͨ��nextInt()��ȡ���������ٽ��Ŷ�ȡ�ַ�����
         * ���������ǻس�����:"\r\n",��ΪnextInt������ȡ������Ϣ����������߻س�����"\r\n".
         * ���ԣ������ҵ������Ҫ��ȡ�������󣬽��Ŷ�ȡ�ַ�������ô��Ӧ������ִ������nextLine()��
         * ��һ����ȡ���������ڶ��β��Ƕ�ȡ�������ַ��� */
        int i = s.nextInt();
        System.out.println("��ȡ��������"+ i);
        String rn = s.nextLine();
        String str1 = s.nextLine();
        System.out.println("��ȡ���ַ����ǣ�"+str1);
	}

}

// ���룺1 2.11 dsafd\r\n1\r\naaaaa
