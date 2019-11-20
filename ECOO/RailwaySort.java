import java.io.*;
import java.util.StringTokenizer;

public class RailwaySort {

	public static void main(String[] args) {
		Reader input = new Reader ();

		for (int i = 0; i < 10; i++){
			int N = input.nextInt();
			int [] num = new int [N];
			
			for (int a = 0; a < N; a++){
				num[a] = input.nextInt();
			}
			
			int counter = 0;
			
			for (int a = N; a > 1; a--){
				int f = 0;
				int s = 0;
				for (int b = 0; b < N ; b++){
					if (num[b] == a){
						f = b;
					}
					else if (num[b] == a-1){
						s = b;
					}
				}
				
				if (s > f){
					int n = num[s];
					counter += s;
		
					for (int c = s; c > 0; c--){
						num[c] = num[c-1];
					}
					num[0] = n;
					
				}
			}
			
			for (int a = 0; a < N; a++){
				if (num[a] == 1){
					counter+=a;
					break;
				}
			}
				
				System.out.println(counter);
			
			
	
			
			
		}
		
		
		
		
		
	}
	
	public static class Reader {
		BufferedReader br;
		StringTokenizer st;
		public Reader(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		public Reader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String nextToken() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		String nextLine(){
			try {
				return br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}
		int nextInt() {
			return Integer.parseInt(nextToken());
		}
		long nextLong() {
			return Long.parseLong(nextToken());
		}
		double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

}
