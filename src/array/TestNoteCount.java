package array;

public class TestNoteCount { 
	public static void main(String[] args) {

		int[] notes = {200, 100, 50, 20, 10, 5, 2, 1 };
		int amount = 45330;
		int count = 0;
		
		// For each Loop
		for(int note : notes) {
			count = amount / note;
		   System.out.println(note + " = " + count);
		   amount = amount % note;
		
		}

		/*
		 * for (int i = 0; i < notes.length; i++) {
		 * 
		 * count = amount / notes[i];
		 * 
		 * if (count > 0) { System.out.println(notes[i] + " = " + count); }
		 * 
		 * amount = amount % notes[i]; }
		 */
	}
}
