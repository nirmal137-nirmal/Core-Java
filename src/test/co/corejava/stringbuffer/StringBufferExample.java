package test.co.corejava.stringbuffer;

public class StringBufferExample {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Nirmal");
		sb.append("Fayake");
		
		System.out.println(sb);
		
		System.out.println("Length :" + sb.length());
		System.out.println("Capacity" + sb.capacity());
		System.out.println("Char at : " + sb.charAt(1));
		System.out.println("Index Of : " + sb.indexOf("Nirmal"));
		System.out.println("Replace : " + sb.replace(0, 6, "Shri"));
		System.out.println("Reverse :" + sb.reverse());
	}

}
