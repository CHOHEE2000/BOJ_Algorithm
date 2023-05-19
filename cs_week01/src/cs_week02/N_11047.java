package cs_week02;
import java.io.*;
public class N_11047 {
	public static int[] coinVal;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String arr = br.readLine();
		String[] info = arr.split(" ");
		
		int n = Integer.parseInt(info[0]);
		int k = Integer.parseInt(info[1]);
		
		coinVal = new int[n];
		for(int i = 0; i < n; i++) {
			coinVal[i] = Integer.parseInt(br.readLine());
		}
		
		int i = n-1;
		int cnt = 0;
		while(k > 0) {
			int j = 0;
			if(k >= coinVal[i]) {
				j = k/coinVal[i];
				k = k - (coinVal[i]*j);
			}
			cnt += j;
			if(i >= 0)
				i--;
			else
				break;
		}
		System.out.println(cnt);
	}

}
