import java.io.*;
import java.util.*;
public class N_2309 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int i, j, match = 0;
		int sum = 0;
		
		int[] h = new int[9];
		for(i = 0; i < 9; i++) {
			h[i] = Integer.parseInt(br.readLine());
		}
		
	}
	
	
	public static int combination(int n, int r) {
		if(n == r || r == 0) 
			return 1; 
		else 
			return combination(n - 1, r - 1) + combination(n - 1, r); 
		}
	
}
