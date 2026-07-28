package array;

public class MaxNumber {
	public static void main(String[] args) {
		
		int [] a = {10,20,30,90,40,50,60,70,80};
		int max = 0;
		
		for(int i = 0; i < a.length; i++) {
			
			if(a[i] > max) {
				
				max = a[i];
			}
		}
		System.out.println("Max Number is :" + max);
	}
}
