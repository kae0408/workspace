
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person taro = new Person();
		taro.name="taro";
		taro.talk();
		taro.age=20;
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		
		Person jiro = new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		
		Person saburo = new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);
		
		Person noname =new Person(25);
		System.out.println(noname.name);
		System.out.println(noname.age);
		
		Person hanako =new Person(17,"hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		
		
		Person kae =new Person(28,"kae","0908890098","k.tazawa.k@gmail.com");
		System.out.println(kae.name);
		System.out.println(kae.age);
		System.out.println(kae.phoneNumber);
		System.out.println(kae.address);
		
		
		Person aibo =new Person("Aibo");
		System.out.println(aibo.name);
		
		Person asimo =new Person("asimo");
		System.out.println(asimo.name);
		
		Person pepper =new Person("pepper");
		System.out.println(pepper.name);
		
		
		
	}

}
