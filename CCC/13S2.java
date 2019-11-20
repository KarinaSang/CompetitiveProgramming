import java.util.*;

public class S213 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int W = sc.nextInt();
		int N = sc.nextInt();
		int counter = 0;
		if(N <= 3) {
			int sum = 0;
			for(int i = 0; i < N; i++) {
				sum += sc.nextInt();
				if(sum <= W) counter++;
				else break;
			}
		}
		else {
			boolean pass = true;
			int a = sc.nextInt();
			if(a <= W) counter++;
			else pass = false;
			int b = sc.nextInt();
			int sum = a+b;
			if(sum <= W) counter++;
			else pass = false;
			int c = sc.nextInt();
			sum += c;
			if(sum <= W) counter++;
			else pass = false;
			int d = sc.nextInt();
			sum += d;
			if(sum <= W) counter++;
			else pass = false;
			for(int i = 0; i < N-4 && pass == true; i++) {
				sum -= a;
				a = b;
				b = c;
				c = d;
				d = sc.nextInt();
				sum += d;
				if(sum <= W) counter++;
				else pass = false;
			}
			}
		
		System.out.println(counter);
		

	}

}
