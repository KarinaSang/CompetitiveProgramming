import java.util.*;
import java.io.*;

public class S212 {
	public static int symbol (char a) {
		if(a == 'I') return 1;
		else if(a == 'V') return 5;
		else if(a == 'X') return 10;
		else if(a == 'L') return 50;
		else if(a == 'C') return 100;
		else if(a == 'D') return 500;
		return 1000;
	}
	public static void main(String[] args) throws IOException {
		FastReader r = new FastReader();
		String s = r.nextLine();
		char[] cha = s.toCharArray();
		int fat = 0;
		int a = 0, b = 0, c = 0, d = 0;
		for(int i = 0; i < s.length()-2; i= i+2) {
			a = Character.getNumericValue(cha[i]);
			b = symbol(cha[i+1]);
			c = Character.getNumericValue(cha[i+2]);
			d = symbol(cha[i+3]);
			if(b >= d) fat = fat + a*b; 
			else fat = fat - a*b;
		}
		fat = fat + c*d;
		System.out.println(fat);
		
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
