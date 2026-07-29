package in.co.corejava.loops;

import java.util.Scanner;

public class ArmStrongNumber {
	
	public static void main(String[] args) {
		int  n , c, r, sum = 0;
		
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		
		n= sc.nextInt();
		
		c = n ;
		while ( n > 0) {
			 r = n % 10;
			 sum = sum + r * r * r;
			 n = n/10;	
		}if(sum == c) {
			System.out.println("Number is Armstrong");
		}else {
			System.out.println("Number is Not Armstrong");
		}	
	}

}