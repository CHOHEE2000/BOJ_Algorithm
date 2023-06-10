package cs_week03;
import java.io.*;
public class N_1105 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String arr = br.readLine();
		String[] info = arr.split(" ");
		
		int L = Integer.parseInt(info[0]);
		int R = Integer.parseInt(info[1]);
		
		int min = 10;
		if(L == R) {
			String n = Integer.toString(L);
			min = countChar(n, '8');
		}
		
		String n = Integer.toString(L);
		int cnt = countChar(n, '8');
		min = cnt;
		L++;
		while(L != R) {
			n = Integer.toString(L);
			cnt = countChar(n, '8');
			if(min > cnt) {
				min = cnt;
				break;
			}
				
			if(min == 0)
				break;
			//System.out.println(min);
			L++;
		}
		
		
		System.out.println(min);
	}
	
	  public static int countChar(String str, char ch) {
	        return str.length() - str.replace(String.valueOf(ch), "").length();
	    }

}
