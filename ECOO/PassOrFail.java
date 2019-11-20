import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		for (int x = 0; x < 10; x++){
			double [] w = new double [4];
			int counter = 0;
			
			for (int i = 0; i < 4; i++){
				w[i] = input.nextDouble()*0.01;
			}
			
			int N = input.nextInt();
			for (int i = 0; i < N; i++){
				double [] m = new double [4];
				
				double f = 0;
				for (int a = 0; a < 4; a++){
					m[a] = input.nextDouble();
					m[a] = m[a] * w[a];
					f += m[a];
				}
				
				if (f >= 50){
					counter++;
				}
				
				
			}
			
			System.out.println(counter);
			
			
			
			
			
		}

	}

}
