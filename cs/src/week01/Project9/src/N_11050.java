import java.io.*;
public class N_11050 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String[] strS = str.split(" ");
		int a = Integer.parseInt(strS[0]);
		int b = Integer.parseInt(strS[1]);
		
		int multA = multia(a, b);
		int multB = multib(b);
		
		System.out.println(multA/multB);
	}
	
	public static int multia(int a, int b) {
		int sum = 1;
		for(int i = 0; i < b; i++) {
			sum *= a;
			a--;
		}
		return sum;
	}
	
	public static int multib(int n) {
		if(n == 1 || n == 0)
			return 1;
		else
			return n*multib(n-1);
	}
}
