
public class Iphone {
	public static void main(String[]args) {
		SmartPhone iphone = new SmartPhone();
		//SmartPhoneクラスをインスタンスするとSmartPhoneでMp3Playerを継承してるのでここでMp3Playerクラスの情報もでる。
		iphone.play();
		iphone.stop();
		iphone.next();
		iphone.back();
		iphone.call();
		iphone.mail();
		iphone.photo();
		iphone.internet();
	}
}
