import java.io.*;
public class N_3036 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String[] strS = str.split(" ");
		
		int main = Integer.parseInt(strS[0]);
		for(int i = 1; i < n; i ++) {
			int res = Integer.parseInt(strS[i]);
			sb.append(main/yaksu(main, res) + "/" + res/yaksu(main, res)).append("\n");
		}
		
		System.out.println(sb);
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