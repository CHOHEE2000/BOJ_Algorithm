import java.io.*;
public class N_1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int min1 = 1000, min2 = 1000;
		String str = br.readLine();
		String[] strS = str.split(" ");
		int x = Integer.parseInt(strS[0]);
		int y = Integer.parseInt(strS[1]);
		int w = Integer.parseInt(strS[2]);
		int h = Integer.parseInt(strS[3]);
		
		if(Math.abs(x-0) <= Math.abs(y-0))
			min1 = Math.abs(x-0);
		else
			min1 = Math.abs(y-0);
		
		if(Math.abs(w-x) <= Math.abs(h-y))
			min2 = Math.abs(w-x);
		else
			min2 = Math.abs(h-y);
		
		System.out.print(min1 < min2 ? min1 : min2);
	}
}
