import java.util.*;

public class Array2D {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[][] test = new int[4][];
		
		for (int i = 0; i < 4; i++) {
			test[i] = new int[random.nextInt(11)];
			
		}
		
		int[] rowLengths = new int[4];
		
		int row0 = test[0].length;
		int row1 = test[1].length;
		int row2 = test[2].length;
		int row3 = test[3].length;
		
		System.out.println("Lengths of each row are: " + row0 + ", " + row1 + ", " + row2 + ", " + row3);
		
		System.out.print("Printing Row 1: ");
		for (int i = 0; i < row0; i++) {
			test[0][i] = i;
		}
		
		for (int x : test[0]) {
			System.out.print(test[0][x]);
		}
		
		
		System.out.print("\nPrinting Row 2: ");
		for (int i = 0; i < row1; i++) {
			test[1][i] = i;
		}
		
		for (int x : test[1]) {
			System.out.print(test[1][x]);
		}
		
		
		System.out.print("\nPrinting Row 3: ");
		for (int i = 0; i < row2; i++) {
			test[2][i] = i;
		}
						
		for (int x : test[2]) {
			System.out.print(test[2][x]);
		}
		
		
		System.out.print("\nPrinting Row 4: ");
		for (int i = 0; i < row3; i++) {
			test[3][i] = i;
		}
								
		for (int x : test[3]) {
			System.out.print(test[3][x]);
		}

	}
}