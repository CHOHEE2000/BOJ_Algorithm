import java.io.*;
public class N_11051 {
	static int[][] memo = new int[1001][1001];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String[] strS = str.split(" ");
		int a = Integer.parseInt(strS[0]);
		int b = Integer.parseInt(strS[1]);
		System.out.println(combination(a, b)%10007);

		
	}
	
	public static int combination(int a, int b) {
		if(memo[a][b] > 0)
			return memo[a][b];
		
		if(a == b || b == 0)
			return memo[a][b] = 1;
		
		return memo[a][b] = combination(a-1, b-1) + combination(a-1, b);
	}
	
}