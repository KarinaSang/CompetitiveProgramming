import java.util.Scanner;
public class ArrivalTime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String time = input.nextLine();
		
		int hour = 0;
		int min = 0;
		final int distance = 12;
		
		for (int i = 0; i < time.length(); i++){
			if (time.charAt(i) == ':'){
				hour = Integer.parseInt(time.substring (0, i));
				
				if (time.charAt(i+1) == '0'){
					min = 0;
				}
				else{
					min = Integer.parseInt(time.substring (i+1));
				}
				
			}
		}
		
		int totalTime = hour*60 + min;
		
		
		if (hour >= 7 && hour <= 10){
			int disTravel = 0;
			totalTime = 10*60 - totalTime;
			disTravel = totalTime/20;
			
			int leftMin = (distance-disTravel) * 10;
			
			hour = 10 + (leftMin - leftMin%60)/60;
			min = leftMin%60;
			
		}
		else if (hour >= 15 && hour <= 19){
			int disTravel = 0;
			totalTime = 19*60 - totalTime;
			disTravel = totalTime/20;
			
			int leftMin = (distance-disTravel) * 10;
			
			hour = 19 + (leftMin - leftMin%60)/60;
			min = leftMin%60;
			
			
		}
		else if (hour+2 >= 7 && hour < 7){
			int disTravel = 0;
			totalTime = 7*60 - totalTime;
			disTravel = totalTime/10;
			
			if (disTravel + 9 >= 12){
			int leftMin = (distance-disTravel) * 20;
			
			hour = 7 + (leftMin - leftMin%60)/60;
			min = leftMin%60;

			}
			else{
				int leftMin = (distance-disTravel - 9) * 10;
				hour = 10 + (leftMin-leftMin%60)/60;
				min = leftMin % 60;
				
			}
		}
		else if (hour+2 >= 15 && hour < 15){
			int disTravel = 0;
			totalTime = 15*60 - totalTime;
			disTravel = totalTime/10;
			
			if (disTravel + 9 >= 12){
			int leftMin = (distance-disTravel) * 20;
			
			hour = 15 + (leftMin - leftMin%60)/60;
			min = leftMin%60;
	
			}
			else{
				int leftMin = (distance - disTravel - 9) * 10;
				
				hour = 19 + (leftMin - leftMin%60)/60;
				min = leftMin%60;
			}
		}
		else{
			hour = hour + 2;
			if (hour >= 24){
				hour = hour - 24;
			}
	
		}
		
		if (min == 0){
			if (hour/10 >=1){
				System.out.println(hour + ":" + min + "0");
			}
			else if (hour/10 < 1){
				System.out.println("0" + hour + ":" + min + "0");
			}
			
		}
		else if (hour/10 < 1){
			if (min == 0){
				System.out.println("0" + hour + ":" + min + "0");
			}
			else if (min != 0){
				System.out.println("0" + hour + ":" + min);
			}
			
		}
		else{
			System.out.println(hour + ":" + min);
		}
		
		

	}

}
