package java_test;

public class LabelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		outloop: //outloop�����ʾ�ǿ����Զ���ı���outloop1,ol2,out5
        for (int i = 0; i < 10; i++) {
             
        	System.out.println("running");
            for (int j = 0; j < 10; j++) {
                System.out.println(i+":"+j);
                if(1==j%2)  
                    break outloop; //�����˫���������ⲿѭ��
            }
             
        }
	}

}
