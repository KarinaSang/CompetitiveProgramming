import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		FastReader sc = new FastReader ();
		int n = sc.nextInt();
		int [] tides = new int [n];
		for(int i = 0; i < n; i++) {
			tides[i] = sc.nextInt();
		}
		Arrays.sort(tides);
		int i = 0;
		int j = 0;
		if(n%2 == 0) {
		i = n/2-1;
		j = n/2;
		}
		else {
			i = n/2;
			j = n/2+1;
		}
		while(i>= 0) {
			System.out.print(tides[i] + " ");
			i--;
			if(j < n) {
			System.out.print(tides[j] + " ");
			j++;
			}
			}
			
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
