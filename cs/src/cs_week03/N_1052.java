package cs_week03;
import java.io.*;
public class N_1052 {
	static int bottle = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String arr = br.readLine();
		String[] info = arr.split(" ");
		
		int N = Integer.parseInt(info[0]);
		int K = Integer.parseInt(info[1]);
		
		//System.out.println(N);
		
		System.out.println(searchCnt(N, K));

	}
	public static int searchCnt(int n, int k) {
		
		int i = 0;
		int j = 0;
		while(n >= j) {
			j = (int) (k * Math.pow(2, i));
			//System.out.println("--" + j);
			bottle = j - n;
			if(bottle >= 0)
				break;
			i++;
		}
		
		
		return bottle;
	}
	
	
}
