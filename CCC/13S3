import java.io.*;
import java.util.*;

public class Main {
   static boolean [][] match = new boolean [5][5];
	static int fav;
	static int ways = 0;
	static int [] points = new int [5];
	public static boolean win (int [] points) {
		for(int i = 1; i <= 4; i++) {
			if(i != fav && points[fav] <= points[i])
			return false;
		}
		return true;
	}
	
	public static void ways () {
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
			
			if(i == 4 && j == 4 && win(points)) {
				ways++;
			}
			
			if(!match[i][j]) {
				match[i][j] = true;
				match[j][i] =true;
				points[i]+=3;
				ways();
				points[i]-=3;
				points[i]++;
				points[j]++;
				ways();
				points[j]+=2;
				points[i]--;
				ways();
				points[j]-=3;
				match[i][j] = false;
				match[j][i] = false;
				i =5;
				j = 5;
			}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		fav = sc.nextInt();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			match[a][b] = true;
			match[b][a] = true;
			int c = sc.nextInt();
			int d = sc.nextInt();
			if(c > d) points[a] +=3;
			else if(c == d) {
				points[a] += 1;
				points[b] += 1;
			}
			else points[b]+=3;
		}
		
		match[1][1] = true;
		match[2][2] = true;
		match[3][3] = true;
		match[4][4] = true;
		
		ways();
		System.out.println(ways);
	}
}
