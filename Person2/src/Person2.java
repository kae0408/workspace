
public class Person2 {
	String name;
	int birthday;
	int manpukudo;
	
	Person2(String name,int birthday,int manpukudo){
		this.name = name;
		this.birthday = birthday;
		this.manpukudo = manpukudo;
	}
	
	Person2(String name,int birthday){
		this(name,birthday,90);
	}
	
	Person2(String name){
		this(name,0,80);
	}
	
	
	Person2(){
		this("不明",0,70);
	}
}