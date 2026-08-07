
package in.co.corejava.oop.Abstraction;

public class BusinessMan extends Person implements RichMan, SocialWorker {

	@Override
	public void helpToOther() {
		// TODO Auto-generated method stub
		System.out.println("help to others");
	}

	@Override
	public void earnMoney() {
		System.out.println("earn money");
	}

	@Override
	public void donation() {
		System.out.println("donation...");
	}

	@Override
	public void party() {
		System.out.println("party...");
	}

}
