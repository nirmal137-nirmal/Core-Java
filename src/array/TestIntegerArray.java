package array;

public class TestIntegerArray {
	public static void main(String[] args) {
		
		int[] arr = {5,10,15,20,25};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + " = " + arr[i]);
		}
		
		System.out.println(" -------------------");
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
