package jp.co.internous.action;

public class HumanName {
	public String lastName;
	private String firstName;
	public String getName() {
		firstName ="山田";
		lastName="太朗";
		String myName=firstName + lastName;
		return myName;
	}

}
