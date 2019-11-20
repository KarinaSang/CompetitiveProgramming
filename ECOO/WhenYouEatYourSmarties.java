import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		//orange ones, then blue, green, yellow, pink, violet, brown and finally red.
		//Scanner sc=new Scanner(new File("DATA11.txt"));
		for(int t=0; t<10; t++){
		int[]s =new int[8];
		int sum=0;
		while(true){
			String temp=sc.nextLine();
			if(temp.equals("end of box"))break;
			switch(temp){
			case "orange":
				s[0]++;
				break;
			case "blue":
				s[1]++;
				break;
			case "green":
				s[2]++;
				break;
			case "yellow":
				s[3]++;
				break;
			case "pink":
				s[4]++;
				break;
			case "violet":
				s[5]++;
				break;
			case "brown":
				s[6]++;
				break;
			case "red":
				s[7]++;
				break;
			}
		}
		
		for(int i=0; i<s.length-1; i++){
			sum+=(s[i]/7)*13;
			if(s[i]%7!=0)sum+=13;
		}
		System.out.println(sum+s[7]*16);
		
	}
	sc.close();
    }
}
