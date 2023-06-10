import java.io.*;
public class N_1358 {
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String[] strS = str.split(" ");
		int w = Integer.parseInt(strS[0]);
		int h = Integer.parseInt(strS[1]);
		int x = Integer.parseInt(strS[2]);
		int y = Integer.parseInt(strS[3]);
		int p = Integer.parseInt(strS[4]);
		
		for(int i = 0; i < p; i++) {
			str = br.readLine();
			strS = str.split(" ");
			int c1 = Integer.parseInt(strS[0]);
			int c2 = Integer.parseInt(strS[1]);
			check(x, y, w, h, c1, c2);
		}
		
		System.out.println(cnt);
	}
	
	public static void check(int x, int y, int w, int h, int c1, int c2) {
		if(c1 <= x && (Math.pow((h/2), 2) >= (Math.pow(c1-x, 2) + Math.pow(c2-(y+(h/2)), 2))))
			cnt++;
		else if(x <= c1 && c1 <= (x+w) && y <= c2 && c2 <= (y+h))
			cnt++;
		else if(c1 >= (x+w) && (Math.pow((h/2), 2) >= (Math.pow(x+w-c1, 2) + Math.pow(y+(h/2)-c2, 2))))
			cnt++;
	}

}
