package java_test;

public class HelloWorld {

	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	boolean b1;	
	char c;       //两个字节
	String str;
	
	void test(){
		//b = 233; //error, -128 ~ 127
		b = -128;
		
		//f = 54.321;  //error java中默认的小数值是double类型的,所以54.321的默认类型是 double，其类型 长度为64，超过了float的长度32 
		f = 54.321f;
		d = 3.14;
		d = 3.14d;
		
		//c = '中国'； //error
		//c = 'ab';	  //error
		c = '中';
		
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
        
        System.out.println(b); //输出true
        System.out.println(!b);//输出false
         
        System.out.println(a^b); //不同返回真
        System.out.println(a^!b); //相同返回假        
        
        int i =1;
        int i1 = 5;
        System.out.println(i ^ i1); //不同返回真

	}

}
