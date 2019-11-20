import java.io.*;
import java.util.*;

public class Main {
   static int N;
	public static void parking (Stack <Integer> car, Stack <Integer> wait ) {
		int counter = 1;
		boolean parked = true;
		while(parked == true) {
			parked = false;
			if(!car.isEmpty()&&car.peek() == counter) {
				counter++;
				car.pop();
				parked = true;
			}
			else {
				if(!wait.isEmpty() && wait.peek()== counter) {
					counter++;
					wait.pop();
					parked = true;
					
				}
				else if(!car.isEmpty()) {
					parked = true;
					wait.push(car.pop());
				}
			}
			
		}
		
		if(counter == N+1) {
			System.out.println("Y");
		}
		else {
			System.out.println ("N");
		}
	}
	public static void main(String[] args) {
		FastReader sc = new FastReader ();
		int T = sc.nextInt();
		for(int g = 0; g < T; g++) {
			N = sc.nextInt();
			Stack <Integer> car = new Stack <> ();
			for(int i = N-1; i >= 0; i--) {
				car.push(sc.nextInt());
			}
			Stack<Integer> wait = new Stack <> ();
			parking(car, wait);
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
