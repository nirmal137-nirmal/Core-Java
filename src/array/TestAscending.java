package array;

import java.util.Arrays;

public class TestAscending {
	public static void main(String[] args) {
		
		int[] arr = {10,25,5,12,94,0,74,93,20, 1, 2};
		
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length ; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
				
//		Arrays.sort(arr);
//		
//		System.out.print("Numbers Accending order is : ");
//		
//		for(int i = 0 ; i <= arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		for(int num : arr) {
//			System.out.print(" "+ num);
//		}		
		}
	}

