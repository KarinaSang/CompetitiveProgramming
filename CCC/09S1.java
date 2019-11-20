import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int counter = 0;
		for(int i = 1; i <= 21; i++) {
			int n = i*i*i*i*i*i;
			if (n>=a && n<=b) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
