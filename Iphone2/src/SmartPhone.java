
public class SmartPhone extends Phone implements Mp3Player, NewFunction{
	// implementsが実装
	public void play() {
		System.out.println("再生");
	}
	
	public void stop() {
		System.out.println("止まる");
	}
	
	public void next() {
		System.out.println("次ぎへ");
	}
	
	public void back() {
		System.out.println("戻る");
	}
	
	public void call() {
		System.out.println("電話");
	}
	
	public void  mail() {
		System.out.println("メール");
	}
}