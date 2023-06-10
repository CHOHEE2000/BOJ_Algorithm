import java.io.*;
public class N_3053 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int r = Integer.parseInt(br.readLine());
		double res1, res2;
		
		res1 = Math.PI*r*r;
		res2 = 2*r*r;
		
		System.out.println(res1 + "\n" + res2);
	}
}
