import java.util.*;
import java.io.*;
public class Main {

	public static void main (String [] args) {
		FastReader sc = new FastReader ();
		for(int x = 0; x < 10; x++) {
			int cost = sc.nextInt();
			double [] stu = new double [5];
			stu[0] = sc.nextDouble();
			stu[1] = sc.nextDouble();
			stu[2] = sc.nextDouble();
			stu[3] = sc.nextDouble();
			double max = stu[0];
			int maxIndex = 0;
			for(int i = 1; i < 4; i++) {
				if(stu[i]>max) {
					max = stu[i];
					maxIndex = i;
				}
			}
			
			int totalStu = sc.nextInt();
			stu[0] = (int) (totalStu*stu[0]-(totalStu*stu[0])%1);
			stu[1] = (int) (totalStu*stu[1]-(totalStu*stu[1])%1);
			stu[2] = (int) (totalStu*stu[2]-(totalStu*stu[2])%1);
			stu[3] = (int) (totalStu*stu[3]-(totalStu*stu[3])%1);
			if(totalStu-stu[0]-stu[1]-stu[2]-stu[3] > 0) {
			stu[maxIndex]+=totalStu-stu[0]-stu[1]-stu[2]-stu[3];
			}
			
			int price = (int) (stu[0]*12 + stu[1]*10 + stu[2]*7 + stu[3]*5);
			if(price/2 >= cost) {
				System.out.println ("NO");
			}
			else {
				System.out.println("YES");
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
