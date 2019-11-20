import java.io.*;
import java.util.*;

public class Main {
   
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int [] frequency = new int [1001];
		for(int i = 0; i < n; i++) {
			frequency[sc.nextInt()]++;
		}
		
		int f = 0;
		List <Integer>fIndex = new LinkedList <>();
		int s = 0;
		int sIndex = -1;
		for(int i = 1; i <= 1000; i++) {
			if(frequency[i]==0)continue;
			if(frequency[i]>f) {
				if(!fIndex.isEmpty()) {
				s = f;
				sIndex = fIndex.get(0);
				}
				f = frequency[i];
				fIndex.clear();
				fIndex.add(i);
			}
			else if(frequency[i] == f) {
				if(fIndex.size()==1) {
					fIndex.add(i);
				}
				else {
					fIndex.add(i);
					Collections.sort(fIndex);
					s = f;
					sIndex = fIndex.get(1);
					fIndex.remove(1);
				}
				
			}
			else if(frequency[i] > s) {
				s = frequency[i];
				sIndex = i;
			}
			else if(frequency[i] == s) {
				if(Math.abs(i-fIndex.get(0)) > Math.abs(sIndex-fIndex.get(0))){
					sIndex = i;
				}
			}
			
		}
		
		if(fIndex.size()!=1) {
			System.out.println(Math.abs(fIndex.get(0)-fIndex.get(1)));
		}
		else {
			System.out.println(Math.abs(fIndex.get(0)-sIndex));
		}

		
	}
}
