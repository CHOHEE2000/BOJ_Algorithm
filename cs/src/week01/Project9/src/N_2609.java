import java.io.*;
public class N_2609 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0;// 최대공약수
		String str = br.readLine();
		String[] strS = str.split(" ");
		int a = Integer.parseInt(strS[0]);
		int b = Integer.parseInt(strS[1]);
		int big = (a < b ? b : a);
		
		for(int i = 1; i <= big; i++) {
			if(a % i == 0 && b % i == 0)
				max = i;
		}
		
		System.out.println(max);
		System.out.println(a*b/max);
	}
}
