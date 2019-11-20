import java.io.*;
import java.util.*;

public class Main {
    	public static void main(String[] args) {
		FastReader sc = new FastReader ();
		int N = sc.nextInt();
		String s = null;
		for(int i = 0; i < N; i++) {
			s = s + sc.nextLine();
		}
		char [] chars = s.toCharArray();
		int countS = 0;
		int countT = 0;
		for(char i : chars) {
			if(i == 's' || i == 'S')countS++;
			else if(i == 't'||i == 'T')countT++;
		}
		if(countT > countS) {
			System.out.println("English");
		}
		else {
			System.out.println("French");
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
