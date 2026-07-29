
package in.co.corejava.array;

public class TwoDArrayint {
	public static void main(String[] args) {
		
		int [][] n = new int[3][3];
		
		n [0][0] = 0;
		n [0][1] = 1;
		n [0][2] = 2;
				
		n [1][0] = 3;
		n [1][1] = 4;
		n [1][2] = 5;
				
		n [2][0] = 6;
		n [2][1] = 7;
		n [2][2] = 8;	
		
		//System.out.println(n[2][0]);
		for(int row = 0; row <n.length; row++) {
			for(int col=0; col<n[0].length; col++) {
				System.out.print(n[row][col] + "\t" );
			}
			
			System.out.println();		
		}	
	}
}
