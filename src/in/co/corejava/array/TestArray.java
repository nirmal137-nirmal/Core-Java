package in.co.corejava.array;

public class TestArray {
	
	public static void main(String[] args) {
		
		int[] a  = { 5, 10, 15, 20, 25, 30};
		
		System.out.println("Length of Array Is : " + a.length);
		System.out.println(a[0] +","+ a[1] +","+a[2] +","+ a[3] +","+ a[4] +","+ a[5]+",");
		System.out.println(a[0] + a[1] + a[3] + a[4] - a[5]) ;
	}
}
