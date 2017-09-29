package java_test;

public class HeroTest {

	//可变数量的参数
	//使用操作数组的方式处理参数heros
	public void getHeroName(Hero ... heros){ 
		System.out.println(heros.length);
		for(int i=0; i<heros.length; i++){
			System.out.println(heros[i].name);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero h1 = new Hero("Auto");
		Hero h2 = new Hero("Mark");
		HeroTest heroT = new HeroTest();
		
		heroT.getHeroName();
		heroT.getHeroName(h1);
		heroT.getHeroName(h1,h2);
	}

}
