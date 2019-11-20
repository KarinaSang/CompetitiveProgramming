import java.util.ArrayList;
import java.util.Scanner;
public class ZeroThatOut {


	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int K = input.nextInt();
		ArrayList <Integer> num = new ArrayList <Integer> ();
		int counter = 0;
		for (int i = 0; i < K; i++){
			int a = input.nextInt();
			if (a == 0){
				counter--;
				num.remove(counter);
			}
			else{
				counter++;
			num.add(a);
			}
			
		}
		
		int sum = 0;
		for (int i=0; i < num.size(); i++){
			sum = sum + num.get(i);
		}
		
		System.out.println(sum);

	}
	

}
