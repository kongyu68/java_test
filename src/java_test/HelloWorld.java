package java_test;

public class HelloWorld {

	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	boolean b1;	
	char c;       //�����ֽ�
	String str;
	
	void test(){
		//b = 233; //error, -128 ~ 127
		b = -128;
		
		//f = 54.321;  //error java��Ĭ�ϵ�С��ֵ��double���͵�,����54.321��Ĭ�������� double�������� ����Ϊ64��������float�ĳ���32 
		f = 54.321f;
		d = 3.14;
		d = 3.14d;
		
		//c = '�й�'�� //error
		//c = 'ab';	  //error
		c = '��';
		
		//b1 = 1; //error
		b1 = true;
		b1 = false;
		
		//l = 9876543210; //error
		l = 9876543210L; 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world!");
        boolean a = false;
        boolean b = true;
        
        System.out.println(b); //���true
        System.out.println(!b);//���false
         
        System.out.println(a^b); //��ͬ������
        System.out.println(a^!b); //��ͬ���ؼ�        
        
        int i =1;
        int i1 = 5;
        System.out.println(i ^ i1); //��ͬ������

	}

}
