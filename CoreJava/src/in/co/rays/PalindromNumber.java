package in.co.rays;

import java.util.Scanner;

public class PalindromNumber {
	public static void main(String[] args) {
		
		int a , b, r, Sum = 0;
		
		System.out.println(" Entern The Number ");
		Scanner in = new Scanner(System.in);
		
		a = in.nextInt();
		
		b = a;
		
		while(a > 0) {
			r = a % 10;
			Sum = (Sum * 10) + r;
			a = a/10; 
		}if (Sum == b) {
			System.out.println("Number is Palindrom");
		}else {
			System.out.println("Number is Not Palindrom");
		}
		
	}

}
