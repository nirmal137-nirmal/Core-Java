package array;

public class TestSecondMaxNumber {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 80, 30, 40, 50 };

		int max = arr[0];
		int secondmax = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}	
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < max && arr[i] > secondmax) {
				secondmax = arr[i];
			}
		}
		System.out.println(secondmax);

	}
}
