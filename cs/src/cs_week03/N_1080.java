package cs_week03;
import java.io.*;
public class N_1080 {
	static int[][] matrixA;
	static int[][] matrixB;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String arr = br.readLine();
		String[] info = arr.split(" ");
		
		int N = Integer.parseInt(info[0]);
		int M = Integer.parseInt(info[1]);
		
		matrixA = new int[N][M];
		for(int i = 0; i < N; i++) {
			arr = br.readLine();
			info = arr.split("");
			for(int j = 0; j < M; j++) {
				matrixA[i][j] = Integer.parseInt(info[j]);
			}
		}
		matrixB = new int[N][M];
		for(int i = 0; i < N; i++) {
			arr = br.readLine();
			info = arr.split("");
			for(int j = 0; j < M; j++) {
				matrixB [i][j] = Integer.parseInt(info[j]);
			}
		}
		
	}

}
