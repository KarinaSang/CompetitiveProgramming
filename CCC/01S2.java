import java.util.Scanner;

public class Main {

	static int [][] spiral;
	static int s;
	static int f;
	static int row;
	static int col;
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		s = sc.nextInt();
		f = sc.nextInt();
		
		int diff = f-s+1;
		int n = (int)Math.sqrt(diff);

		
		if(diff-n*n == 0) {
			spiral = new int [n][n];
		}
		else if (diff-n*n <= n+1) {
			spiral = new int [n+1][n];
		}
		else if (diff-n*n <=2*n) {
			spiral = new int [n+1][n+1];
		}
		
		//find start position
		if(spiral.length%2 == 0) row = spiral.length/2-1;
		else row = spiral.length/2;
		
		if(spiral[0].length%2 == 0)col = spiral[0].length/2-1;
		else col = spiral[0].length/2;
	
		printNum();
	}
	
	public static void printNum () {
		//assign
		int counter = 1;
		spiral[row][col] = s;
		while(s < f ) {			
			//down
			for(int i = 1; i <= counter && s<f; i++) {
				row++;
				s++;
				spiral[row][col] = s;
			}
			//right
			for(int i = 1; i <= counter && s<f; i++) {
				col++;
				s++;
				spiral[row][col] = s;
			}
			counter++;
			//up
			for(int i = 1; i <= counter && s<f; i++) {
				row--;
				s++;
				spiral[row][col] = s;
			}
			//left
			for(int i = 1; i <= counter && s<f; i++) {
				col--;
				s++;
				spiral[row][col] = s;
			}
			counter++;
		}
		
		//output
		for(int i = 0; i < spiral.length; i++) {
			for(int j = 0; j < spiral[0].length; j++) {
				if(spiral[i][j] == 0) System.out.print("   ");
				else System.out.print(spiral[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
