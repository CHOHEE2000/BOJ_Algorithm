import java.io.*;
public class N_5086 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
				
		String str = br.readLine();
		while(!str.equals("0 0")) {
			String[] strS = str.split(" ");
			int a = Integer.parseInt(strS[0]);
			int b = Integer.parseInt(strS[1]);
			if(check(a, b) == 1)
				sb.append("factor").append("\n");
			else if(check(a, b) == 0)
				sb.append("multiple").append("\n");
			else
				sb.append("neither").append("\n");
			str = br.readLine();	
		}
		
		System.out.println(sb);
	}
	
	public static int check(int a, int b) {
		if(a < b && b % a == 0)
			return 1;
		else if(a > b && a % b == 0)
			return 0;
		else
			return -1;
	}
}
