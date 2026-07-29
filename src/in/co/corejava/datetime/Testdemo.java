package in.co.corejava.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Testdemo {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = new Date();
		
		System.out.println("Current date is" + d);
		
		System.out.println(sdf.format(d));
		
		System.out.println("-----------------------------------");
		
		String str = "2001-07-13";
		
		System.out.println(sdf.parse(str));
	}

}
