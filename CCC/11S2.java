import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		FastReader sc = new FastReader ();
		int N = sc.nextInt();
		String [] hi = new String [N];
		for(int i = 0; i < N; i++) {
			hi[i] = sc.next();
		}
		int counter = 0;
		for(int i = 0; i < N; i++) {
			if(hi[i].equals(sc.next()))counter++;
		}
		System.out.println(counter);
		

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
