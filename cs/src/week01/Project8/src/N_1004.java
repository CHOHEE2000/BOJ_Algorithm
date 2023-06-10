import java.io.*;
public class N_1004 {
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int testCase = Integer.parseInt(br.readLine());
		
		while(testCase > 0) {
			String str = br.readLine();
			String[] strS = str.split(" ");
			int x1 = Integer.parseInt(strS[0]);
			int y1 = Integer.parseInt(strS[1]);
			int x2 = Integer.parseInt(strS[2]);
			int y2 = Integer.parseInt(strS[3]);
			
			int planetN = Integer.parseInt(br.readLine());
			for(int i = 0; i < planetN; i++) {
				str = br.readLine();
				strS = str.split(" ");
				int c1 = Integer.parseInt(strS[0]);
				int c2 = Integer.parseInt(strS[1]);
				int r = Integer.parseInt(strS[2]);
				checkInclude(x1, y1, x2, y2, c1, c2, r);
			}
			testCase--;
			sb.append(cnt).append("\n");
			cnt = 0;
		}
		System.out.println(sb);
	}
	
	public static void checkInclude(int x1, int y1, int x2, int y2, int c1, int c2, int r) {
		int preCnt = cnt;
		if(Math.pow(r, 2) > (Math.pow(c1-x1, 2) + Math.pow(c2-y1, 2)))//출발지점 
			cnt++;
		if(Math.pow(r, 2) > (Math.pow(c1-x2, 2) + Math.pow(c2-y2, 2)))//도착지점
			cnt++;
		if(preCnt + 2 == cnt)
			cnt = preCnt;
		
	}

}
