import java.io.*;
public class N_3009 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] x = new int[4];
		int[] y = new int[4];
		int a, b, c, d;
		
		for(int i = 0; i < 3; i++) {
			String str = br.readLine();
			String[] strS = str.split(" ");
			x[i] = Integer.parseInt(strS[0]);
			y[i] = Integer.parseInt(strS[1]);
		}
		
		a = x[0];
		b = y[0];
		if(a == x[1])
			c = x[2];
		else if(a != x[2])
			c = a;
		else
			c = x[1];
		
		if(b == y[1])
			d = y[2];
		else if(b != y[2])
			d = b;
		else
			d = y[1];
			
		System.out.print(c + " " + d);
	}
}
