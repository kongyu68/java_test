package java_test;
import java.util.Arrays;

public class ArrayFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
        
        //���鸴��
        // copyOfRange(int[] original, int from, int to)
        // ��һ��������ʾԴ����
        // �ڶ���������ʾ��ʼλ��(ȡ�õ�)
        // ������������ʾ����λ��(ȡ����)
        int[] b = Arrays.copyOfRange(a, 1, 3);
 
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        
        //������ת��Ϊ�ַ���
        String content = Arrays.toString(a);
        System.out.println(content);
        
        //����
        System.out.println("����֮ǰ :");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("����֮��:");
        System.out.println(Arrays.toString(a));
        
        
        //��ѯԪ�س��ֵ�λ��                
        //ʹ��binarySearch֮ǰ��������ʹ��sort��������
        //����������ж����ͬ��Ԫ�أ����ҽ���ǲ�ȷ����
        System.out.println("���� 62���ֵ�λ��:"+ Arrays.binarySearch(a, 62));
        
        //�Ƚ���������������Ƿ�һ��
        int c[] = new int[] { 18, 62, 68, 82, 65, 8 };        
        System.out.println(Arrays.equals(a, c));
        
        //ʹ��ͬһ��ֵ�������������
        int d[] = new int[6];        
        Arrays.fill(d, 5);  
        System.out.println(Arrays.toString(d));
	}

}


