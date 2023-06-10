import java.io.*;
public class N_1934 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			String[] strS = str.split(" ");
			int a = Integer.parseInt(strS[0]);
			int b = Integer.parseInt(strS[1]);
			
			int yaksuu = yaksu(a, b);
			System.out.println(a*b/yaksuu);
		}
	}
	
	public static int yaksu(int a, int b) {
		int big = (a < b ? b : a);
		int max = 0;
		
		for(int i = 1; i <= big; i++) {
			if(a % i == 0 && b % i == 0)
				max = i;
		}
		return max;
	}
}
