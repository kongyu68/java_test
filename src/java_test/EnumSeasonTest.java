package java_test;

public class EnumSeasonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumSeason season = EnumSeason.SPRING;
        
		//ʹ����ǿ��for ѭ������ö��
		for (EnumSeason s : EnumSeason.values()) {
            System.out.println(s);
        }
	}

}
