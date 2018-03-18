
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person taro = new Person("taro",28);
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		Person saburo = new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);
		
		Person humun = new Person(25);
		System.out.println(humun.name);
		System.out.println(humun.age);
		
		Person hanako = new Person(27,"hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		
	}

}
