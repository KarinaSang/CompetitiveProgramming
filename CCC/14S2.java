import java.util.ArrayList;
import java.util.Scanner;
public class PartnerUp {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int num = input.nextInt();
		input.nextLine();
		ArrayList <String> one = new ArrayList <String> ();
		for (int i = 0; i < num; i++){
			one.add(input.next());
		}
		
		ArrayList <String> two = new ArrayList <String> ();
		for (int i = 0; i < num; i++){
			two.add(input.next());
		}
		
		
		
		boolean result = check (one, two, 0, num);
		
		if (result == true){
			System.out.println("good");
		}
		else{
			System.out.println("bad");
		}
		
		
		
}
	
	public static boolean check (ArrayList <String> one, ArrayList <String> two, int counter, int num){
		if (counter == num){
			return true;
		}
		
		for (int i = 1; i < one.size(); i++){
			if (one.get(0).equals(two.get(i)) && two.get(0).equals(one.get(i))){
				one.remove(i);
				one.remove(0);
				two.remove(i);
				two.remove(0);
				return check (one, two, counter+2, num);
			}
		}
		
		return false;
	}
}
