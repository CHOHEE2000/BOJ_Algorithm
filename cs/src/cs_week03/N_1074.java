package cs_week03;
import java.io.*;
public class N_1074 {
	static int[] nx = {0, 0, 1, 1};
	static int[] ny = {0, 1, 0, 1};
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arrr = br.readLine();
		String[] info = arrr.split(" ");
		
		int N = Integer.parseInt(info[0]);
		int r = Integer.parseInt(info[1]);
		int c = Integer.parseInt(info[2]);
		
		int[][] arr = new int[N][N];
		
		int size = (int) Math.pow(2, N);
		countZ(size, 0, 0, r, c);
		//System.out.println(cnt);
		
	}
	public static void countZ(int size, int r, int c, int ansR, int ansC) {
		int currentR;
		int currentC;
		
		for(int i = 0; i < 4; i++) {
			currentR = (nx[i]*(size/2)) + r;
			currentC = (ny[i]*(size/2)) + c;
			
			if(size == 2) {
				if(currentR == ansR && currentC == ansC) {
					System.out.println(cnt);
					return;
				}
				cnt++;
			}else {
				
				countZ(size/2,currentR,currentC, ansR, ansC);
			}
				
		}
		
		return;
		
	}

}
