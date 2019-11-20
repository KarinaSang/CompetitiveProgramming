import java.io.*;
import java.util.*;

public class Main {
   static String output = "";
	public static String firstCase (String str) {
		String hi = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'A' || str.charAt(i) == 'T') {
				hi += "1";
			}
			else {
				hi+="0";
			}
		}
		return hi;
	}
	
	public static String secondCase (String str) {
		String hi = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'C' || str.charAt(i) == 'G') {
				hi += "1";
			}
			else {
				hi+="0";
			}
		}
		return hi;
	}
	
	public static boolean result (String str) {
		output = "";
		for(int i = 0; i+8 <= str.length(); i+=8) {
			char cur = (char)Integer.parseInt(str.substring(i,i+8),2);
			if((cur >='A' && cur <= 'Z')|| cur == ' ') {
				output +=cur;
			}
			else {
				output = "";
				return false;
			}
		}
		return true;
	}
	
	public static void main (String [] args) throws FileNotFoundException {
		//Scanner sc = new Scanner (new File ("Hi.txt"));
		FastReader sc = new FastReader();
		
		
		for(int x = 0; x < 10; x++) {
			String first = sc.nextLine();
			String second = sc.nextLine();
			first = firstCase(first);
			second = secondCase(second);
			int start = 0;
			boolean found = false;
			while(start <= 7) {
				if(result(first.substring(start))){
					found = true;
					System.out.println(output);
					break;
				}
				else {
					start++;
				}
			}
			
			if(!found) {
				output = "";
				start = 0;
				while(start <= 7) {
					if(result(second.substring(start))){
						found = true;
						System.out.println(output);
						break;
					}
					else {
						start++;
					}
				}
			}
		
			}
			
		

	}
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

}
