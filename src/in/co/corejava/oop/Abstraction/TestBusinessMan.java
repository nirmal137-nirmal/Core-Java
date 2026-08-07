package in.co.corejava.oop.Abstraction;

public class TestBusinessMan {
public static void main(String[] args) {
		
		RichMan r = new BusinessMan();
		
		r.donation();
		r.earnMoney();
		r.party();
		
		System.out.println("---------------");
		
		SocialWorker s = new BusinessMan();
		
		s.helpToOther();
		
		System.out.println("---------------");
		
		BusinessMan bm = new BusinessMan();
		
		bm.donation();
		bm.earnMoney();
		bm.helpToOther();
		bm.party();
	}

}