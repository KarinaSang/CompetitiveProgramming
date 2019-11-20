import java.util.*;

public class Main {
 static int N, M;
	static int [] distance;
	static boolean [] marked;
	static boolean [] pho;
	static ArrayList <Integer> list[];
	static int totalDistance = 0;
	
	public static void mark (int cur, int prev) {
		if(pho[cur]) {
			marked[cur] = true;
		}
		for(int i : list[cur]) {
			if(i !=prev) {
				mark(i, cur);
				if(marked[i]) {
					totalDistance+=2;
					marked[cur] = true;
				}
			}
			
		}
	}
	
	public static void dfs (int cur, int prev, int depth) {
		distance[cur] = depth;
		for(int i : list[cur]) {
			if(i != prev && marked[i]) {
				dfs(i, cur, depth+1);
			}
		}
	}
	
	public static void main(String[] args) {
		FastReader sc = new FastReader ();
		N = sc.nextInt();
		M = sc.nextInt();
		distance = new int [N];
		marked = new boolean [N];
		pho = new boolean [N];
		list = new ArrayList [N];
		for(int i = 0; i < N; i++) {
			list[i] = new ArrayList <Integer> ();
		}
		
		for(int i = 0; i < M; i++) {
			pho[sc.nextInt()] = true;
		}
		for(int i = 0; i < N-1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list[a].add(b);
			list[b].add(a);
		}
		

		for(int i = 0; i < N; i++) {
			if(pho[i]) {
				mark(i, -1);
				break;
			}
		}
		
		for(int i = 0; i < N; i++) {
		if(marked[i]) {	
		dfs(i, -1, 0);
		break;
		}
		}
		
		int maxIndex = -1;
		for(int i = 1; i < N; i++) {
			if(marked[i] && (maxIndex == -1 || distance[maxIndex] < distance[i])) {
				maxIndex = i;
			}
		}
		
		distance = new int [N];
		dfs(maxIndex, -1, 0);
		maxIndex = 0;
		for(int i = 1; i < N; i++) {
			if(distance[maxIndex] < distance[i]) {
				maxIndex = i;
			}
		}
		System.out.println(totalDistance-distance[maxIndex]);
	
		
	}
	static class FastReader
    {
        BufferedReader br;
       StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

}
