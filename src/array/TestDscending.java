package array;

import java.util.Arrays;

public class TestDscending {
	public static void main(String[] args) {
		
		int[] arr = {7418, 2, 12, 40, 23, 45, 34, 233, 122, 378, 975};
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length ; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
		
		
		
		
		
		
		
		
		
		//Arrays.sort(arr);
		
		/*
		 * System.out.println("Descending Order : ");
		 * 
		 * for(int i = arr.length - 1; i >= 0 ; i-- ) { System.out.print(arr[i]);
		 * 
		 * }
		 */
	}

}
