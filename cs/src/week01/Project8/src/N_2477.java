import java.io.*;
import java.util.*;
public class N_2477 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] TypeA = new int[6];
		int[] TypeB = new int[6];
		int[] TypeC = new int[6];

		int[][] arr = new int[6][2];
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < 6; i ++) {
			String str = br.readLine();
			String[] strS = str.split(" ");
			arr[i][0] = Integer.parseInt(strS[0]);
			arr[i][1] = Integer.parseInt(strS[1]);
			
			
		}
	}
}
