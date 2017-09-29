package java_test;

public class EnumSeasonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumSeason season = EnumSeason.SPRING;
        
		//使用增强型for 循环遍历枚举
		for (EnumSeason s : EnumSeason.values()) {
            System.out.println(s);
        }
	}

}
