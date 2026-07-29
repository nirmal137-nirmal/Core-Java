package in.co.corejava.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestCommonPattern {
	public static void main(String[] args) {
		
		Date d = new Date();
		
		// 1.
		SimpleDateFormat sdt = new SimpleDateFormat("dd.MM.yy");
		
		System.out.println(sdt.format(d));
		
		// 2.
		System.out.println("------Print Hours & Minute----");
		
		SimpleDateFormat s = new SimpleDateFormat("H:mm");
		
		System.out.println(s.format(d));
		
		// 3.
		System.out.println("--------------------------------");
		
		SimpleDateFormat a = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
		System.out.println(a.format(d));
		
		// 4. 
		System.out.println("--------------------------------");
		
		SimpleDateFormat b =  new SimpleDateFormat("H:mm:ss:SSS");
		
		System.out.println(b.format(d));
		
		// 5. 
		System.out.println("--------------------------------");
		
		SimpleDateFormat c = new SimpleDateFormat("K:mm a, z");
		System.out.println(c.format(d));
		
		// 6.
		System.out.println("--------------------------------");
		
		SimpleDateFormat e = new SimpleDateFormat("yyyy-MMMMM-dd GGG hh:mm aaa");
		System.out.println(e.format(d));
		
		// 7. 
		System.out.println("--------------------------------");
		
		SimpleDateFormat f = new SimpleDateFormat("h:mm a");
		System.out.println(f.format(d));
		
		// 8. 
		System.out.println("--------------------------------");
		
		SimpleDateFormat g = new SimpleDateFormat("EEE-MM- d,  yy");
		System.out.println(g.format(d));

	}

}
