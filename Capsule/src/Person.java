
public class Person {
	// 陰蔽部 privateだと他のクラスからアクセスできない　public はアクセスできる
	private String name = null;
	private int age = 0;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// privateでカプセル化した際、Capsule.javaにデータを渡したいので下記をかく。
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name =name;
	}

}
