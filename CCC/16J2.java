import java.util.Scanner;
public class MagicSquare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [][] numList = new int [4][4];
		
		for (int i = 0; i < 4; i++){
			String numbers = input.nextLine();
			numbers = numbers + " ";
			
			int startIndex = 0;
			int counter = 0;
			for (int a = 0; a < numbers.length(); a++){
				if (numbers.charAt(a) == ' '){
					numList[i][counter] = Integer.parseInt (numbers.substring(startIndex, a));
					startIndex = a+1;
					counter++;
				}
			}
		}
		
		boolean check = true;
		int sum1 = numList[0][0] + numList[0][1] + numList[0][2] + numList[0][3];
		int countRowSum = 0;
		int sum2 = numList[0][0] + numList[1][0] + numList[2][0] + numList[3][0];
		int countColSum = 0;
		
		for (int i = 0; i < 4; i++){
			countRowSum = 0;
			countColSum = 0;
			for (int a = 0; a < 4; a++){
				countRowSum = countRowSum + numList[i][a];
				countColSum = countColSum + numList[a][i];
			}
			if (countRowSum != sum1 || countColSum != sum2){
				check = false;
				i = 4;
			}
		}
		
		if (check){
			System.out.println("magic");
		}
		else if (!check){
			System.out.println("not magic");
		}
		
		
	

	}

}
