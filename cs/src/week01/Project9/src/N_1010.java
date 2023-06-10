import java.io.*;
public class N_1010 {
	static int[][] memo = new int[30][30];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int testCase = Integer.parseInt(br.readLine());
		
		while(testCase != 0) {
			String str = br.readLine();
			String[] strS = str.split(" ");
			int n = Integer.parseInt(strS[0]);
			int m = Integer.parseInt(strS[1]);
			sb.append(combination(m, n)).append('\n');
			testCase--;
		}
		
		System.out.println(sb);
	}

	public static int combination(int a, int b) {
		if(memo[a][b] > 0)
			return memo[a][b];
		
		if(a == b || b == 0)
			return memo[a][b] = 1;
		
		return memo[a][b] = combination(a-1, b-1) + combination(a-1, b);
	}
	
}
