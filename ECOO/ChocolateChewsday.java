import java.util.*;
import java.io.*;
public class Main {
	static int [] P;
	static int []F;
	static int []G;
	static String [] names;
	public static void bestCho () {
		List <Integer> ok = new ArrayList <Integer> ();
		int max = P[0]+F[0]+G[0];
		int maxIndex = 0;
		ok.add(0);
		for(int i = 1; i < names.length; i++) {
			int cur =  P[i]+F[i]+G[i];
			if(max < cur) {
				ok.clear();
				ok.add(i);
				max = cur;
				maxIndex = i;
			}
			else if(max == cur) {
				if(G[maxIndex]<G[i]) {
					ok.clear();
					ok.add(i);
					maxIndex = i;
				}
				else if(G[maxIndex] == G[i]) {
					if(F[maxIndex]<F[i]) {
						ok.clear();
						ok.add(i);
						maxIndex = i;
					}
					else if(F[maxIndex] == F[i]) {
						if(P[maxIndex] < P[i]) {
							ok.clear();
							ok.add(i);
							maxIndex = i;
						}
						else if(P[maxIndex] == P[i]) {
							ok.add(i);
						}
					}
				}
			}
		}
		if(ok.size()==1) {
			System.out.println(names[ok.get(0)]);
			return;
		}
		for(int i = 0; i < ok.size(); i++) {
			if(i == ok.size()-1) {
			System.out.print(names[ok.get(i)]);
			System.out.println();
			}
			else {
				System.out.print(names[ok.get(i)] + ",");
			}
		}
		
	}
	
	
	public static void main (String [] args) {
		FastReader sc = new FastReader ();
		for(int y = 0; y < 10; y++) {
			int N = sc.nextInt();
			names = new String [N];
			P = new int [N];
			F = new int [N];
			G = new int [N];
			for(int x = 0; x < N+1; x++) {
			String input = sc.next();
			if(input.equals("J")) {
				x--;
				P[x]+=sc.nextInt();
				F[x]+=sc.nextInt();
				G[x]+=sc.nextInt();	
			}
			else if(input.equals("*"))break;
			else {
				names[x] = input;
				
			}
			}
			bestCho();
			
			
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
