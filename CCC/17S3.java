import java.util.Scanner;

public class S32017 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int [] w = new int [2001];
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			int a = s.nextInt();
			w[a]++;
		}

		int maxL = 1;
		int maxW = 0;
		for (int i = 2; i <= 4000; i++) {
			int length = 0;
			for (int j = 1; j <= 2000 && i-j >= j; j++) {
				if(i-j <= 2000) {
				if(j == i-j) {
					
					if (w[j] % 2 == 1) {
						length = length + (w[j]-1)/2;
					}
					else {
						length = length + w[j]/2;
					}
				}
				else {
				int a = Math.min(w[j], w[i-j]);
				length = length + a;
				

				}
				}
				
			}
			
			if (maxL < length) {
				maxL = length;
				maxW = 1;
			}
			else if (maxL == length) {
				maxW++;
			}
		}
		
		System.out.println(maxL + " " + maxW);

	}

}
