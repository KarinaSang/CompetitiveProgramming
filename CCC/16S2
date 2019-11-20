import java.util.Scanner;
public class TandemBicycle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int question = input.nextInt();
		
		int N = input.nextInt();
		input.nextLine();
		
		int [] dmoj = new int [N];
		int [] peg = new int [N];
		
		String d = input.nextLine();
		d = d + " ";
		String p = input.nextLine();
		p = p + " ";
		int counter = 0;
		int startIndex = 0;
		
		for (int i = 0; i < d.length(); i++){
			if (d.charAt(i) == ' ' && counter < N){
				dmoj[counter] = Integer.parseInt (d.substring(startIndex, i));
				startIndex = i+1;
				counter++;
			}
		}
		
		counter = 0;
		startIndex = 0;
		
		for (int i = 0; i < p.length(); i++){
			if (p.charAt(i) == ' ' && counter < N){
				peg[counter] = Integer.parseInt (p.substring(startIndex, i));
				startIndex = i+1;
				counter++;
			}
		}
		
		sort(dmoj);
		sort(peg);
		
		int total = 0;
		if (question == 1){
			for (int i = 0; i < N; i++){
				total = total + max(dmoj[i], peg[i]);
			}
			System.out.println(total);
		}
		else{
			for (int i = 0; i < N; i++){
				total = total + max (dmoj[i], peg[N-1-i]);
			}
			System.out.println(total);	
		}
	}
	
	public static void sort (int [] list){
		int key;
		int j;
		for (int i = 1; i < list.length; i++){
			key = list[i];
			for (j = i-1; j>=0 && key<list[j]; j--){
				list[j+1] = list[j];
			}
			list[j+1] = key;
		}
	}
	
	public static int max (int a, int b){
		if (a >= b){
			return a;
		}
		else{
			return b;
		}
	}

}
