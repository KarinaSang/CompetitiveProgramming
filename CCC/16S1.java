import java.util.Scanner;
public class Ragaman {
	public static void main (String args []){
		Scanner input = new Scanner (System.in);
		String line1 = input.nextLine();
		String line2 = input.nextLine();
		int counter = 0;
		
		if (line1.length() == line2.length()){
			for (int a = 0; a < line1.length(); a++){
				for (int i = 0; i < line1.length(); i++){
					if (line2.charAt(a) == line1.charAt(i)){
						String newstr = line1.substring(0, i) + " " + line1.substring(i + 1);
						line1 = newstr;
						i = line1.length();
						counter++;
					}
					else if (line2.charAt(a) == '*'){
						counter++;
						i = line1.length();
					}
				}
				if (counter <= a){
					a = line1.length();
				}
			}
		}
		
		if (counter == line1.length()){
			System.out.println("A");
		}
		else{
			System.out.println("N");
		}
	}
}
